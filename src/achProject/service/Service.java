package achProject.service;

import achProject.controller.FileController;
import achProject.model.Cours;
import achProject.model.Etudiant;
import achProject.utils.Clavier;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Service implements IService{

    private FileController fileController = new FileController();

    @Override
    public void ReadFile() throws IOException, ClassNotFoundException {

        List result = new ArrayList();

        System.out.println(">>>> READ A FILE <<<<<");
        System.out.println("1 - Read the students ' file");
        System.out.println("2 - Read the courses ' file");
        System.out.println("3 - Back");
        System.out.println("Please choose the correct number: ");
        System.out.print(">>> ");

        int choice = Clavier.readInt();
        switch(choice) {
            case 1:
                displayAllEtudiants();
                break;
            case 2:
                displayAllCours();
                break;
            case 3:
                break;
        }

    }


    @Override
    public void inscriptionEtudiant() throws IOException, ClassNotFoundException {
        System.out.println(">>>> STUDENT INSCRIPTION <<<<<");

        this.displayAllEtudiants();

        System.out.println(">>>>Select the correct id of the student wich you want for the inscription?");
        int etuChoice = Clavier.readInt();

        this.displayAllCours();

        System.out.println(">>>>Select the correct id of the course which you want to enroll him?");
        int couChoice = Clavier.readInt();

        Etudiant etudiant = fileController.findOneEtudiant(etuChoice);
        Cours cours = fileController.findOneCours(couChoice);

        fileController.inscrire(etudiant,cours);

        System.out.println(">>>>INSCRIPTION COMPLETED");

    }

    @Override
    public void displayEtudiantInCours() throws IOException, ClassNotFoundException {

        System.out.println(">>>> DISPLAY STUDENTS IN ONE COURSE <<<<<");

        displayAllCours();

        System.out.println(">> CHOOSE THE ID OF ONE COURSE:");

        int choice = Clavier.readInt();

        List result = fileController.findOneCours(choice).getEtudiantList();
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }
    }

    @Override
    public void displayAllEtudiants() throws IOException, ClassNotFoundException {

        List result = fileController.findAllEtudiants();
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }
    }

    @Override
    public void displayAllCours() throws IOException, ClassNotFoundException {

            List result = fileController.findAllCours();
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i).toString());
        }

    }

    @Override
    public void displayAllCoursOfOneEtudiant() throws IOException, ClassNotFoundException {

        System.out.println(">>>> DISPLAY ALL COURSES OF ONE STUDENT <<<<<");

        displayAllEtudiants();

        System.out.println(">> CHOOSE THE ID OF ONE COURSE:");

        int choice = Clavier.readInt();

        List result = fileController.findOneEtudiant(choice).getListCoursInscrits();
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }

    }

    @Override
    public void addEtudiant() throws IOException, ClassNotFoundException {

        System.out.println(">>>> ADD A STUDENT <<<<<");

        System.out.println("Please enter the last name: ");
        System.out.print(">>> ");
        String nom = Clavier.readString();

        System.out.println("Please enter the first name: ");
        System.out.print(">>> ");
        String prenom = Clavier.readString();

        Etudiant etudiant = new Etudiant(nom , prenom , "ETU"+UUID.randomUUID().toString());

        fileController.addEtudiant(etudiant);

        System.out.println(">>>> STUDENT ADDED <<<<<");


    }

    @Override
    public void addCours() throws IOException, ClassNotFoundException {

        System.out.println(">>>> ADD A COURSE <<<<<");

        System.out.println("Please enter the Sigle: ");
        System.out.print(">>> ");
        String sigle = Clavier.readString();

        System.out.println("Please enter the title: ");
        System.out.print(">>> ");
        String title = Clavier.readString();

        System.out.println("Please enter the max number in this class: ");
        System.out.print(">>> ");
        int nbre = Clavier.readInt();

        fileController.addCours(new Cours(sigle,title,nbre));

        System.out.println(">>>> COURSE ADDED <<<<<");


    }

    @Override
    public void deleteEtudiant() throws IOException, ClassNotFoundException {

        System.out.println(">>>> DELETE ONE STUDENT <<<<<");

        displayAllEtudiants();

        System.out.println(">> CHOOSE THE ID OF ONE STUDENT:");

        int choice = Clavier.readInt();

        fileController.deleteEtudiant(choice);

        System.out.println(">>>> STUDENT DELETED <<<<<");

    }

    @Override
    public void deleteCours() throws IOException, ClassNotFoundException {

        System.out.println(">>>> DELETE ONE COURSE <<<<<");

        displayAllCours();

        System.out.println(">> CHOOSE THE ID OF ONE COURSE:");

        int choice = Clavier.readInt();

        fileController.deleteCours(choice);

        System.out.println(">>>> COURSE DELETED <<<<<");

    }

    @Override
    public void updateEtudiant() throws IOException, ClassNotFoundException {

        System.out.println(">>>> UPDTATE ONE STUDENT <<<<<");

        displayAllEtudiants();

        System.out.println(">> CHOOSE THE ID OF ONE STUDENT:");

        int choice = Clavier.readInt();

        System.out.println("Please enter the last name: ");
        System.out.print(">>> ");
        String nom = Clavier.readString();

        System.out.println("Please enter the first name: ");
        System.out.print(">>> ");
        String prenom = Clavier.readString();

        Etudiant etudiant = fileController.findOneEtudiant(choice);

        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);

        fileController.updateEtudiant(etudiant);

        System.out.println(">>>> STUDENT UPDATED <<<<<");

    }

    @Override
    public void updateCours() throws IOException, ClassNotFoundException {

        System.out.println(">>>> UPDTATE ONE COURSE <<<<<");

        displayAllCours();

        System.out.println(">> CHOOSE THE ID OF ONE COURSE:");

        int choice = Clavier.readInt();

        System.out.println("Please enter the sigle: ");
        System.out.print(">>> ");
        String sigle = Clavier.readString();

        System.out.println("Please enter the title: ");
        System.out.print(">>> ");
        String title = Clavier.readString();

        System.out.println("Please enter the max number in this course: ");
        System.out.print(">>> ");
        int nbre = Clavier.readInt();

        Cours cours = fileController.findOneCours(choice);

        cours.setSigle(sigle);
        cours.setTitre(title);
        cours.setNbreMaxEtu(nbre);
        fileController.updateCours(cours);

        System.out.println(">>>> COURSE UPDATED <<<<<");

    }
}
