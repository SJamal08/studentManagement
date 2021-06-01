package achProject.controller;

import achProject.model.Cours;
import achProject.model.Etudiant;
import achProject.repository.CoursRepository;
import achProject.repository.EtudiantRepository;
import achProject.repository.InscriptionRepository;

import java.io.IOException;
import java.util.List;

public class FileController implements IController{
    @Override
    public void addEtudiant(Etudiant etudiant) throws IOException, ClassNotFoundException {
        new EtudiantRepository().create(etudiant);
    }

    @Override
    public List<Etudiant> findAllEtudiants() throws IOException, ClassNotFoundException {
        return new EtudiantRepository().findAll();
    }

    @Override
    public Etudiant findOneEtudiant(int id) throws IOException, ClassNotFoundException {
        return new EtudiantRepository().findOne(id);
    }

    @Override
    public void updateEtudiant(Etudiant etudiant) throws IOException, ClassNotFoundException {
        new EtudiantRepository().update(etudiant);

    }

    @Override
    public void deleteEtudiant(int id) throws IOException, ClassNotFoundException {
        new EtudiantRepository().delete(id);

    }

    @Override
    public void addCours(Cours cours) throws IOException, ClassNotFoundException {
        new CoursRepository().create(cours);

    }

    @Override
    public List<Cours> findAllCours() throws IOException, ClassNotFoundException {
        return new CoursRepository().findAll();
    }

    @Override
    public Cours findOneCours(int id) throws IOException, ClassNotFoundException {
        return new CoursRepository().findOne(id);
    }

    @Override
    public void updateCours(Cours cours) throws IOException, ClassNotFoundException {
        new CoursRepository().update(cours);

    }

    @Override
    public void deleteCours(int id) throws IOException, ClassNotFoundException {
        new CoursRepository().delete(id);

    }

    @Override
    public void inscrire(Etudiant etudiant, Cours cours) throws IOException, ClassNotFoundException {
        new InscriptionRepository().inscrire(cours, etudiant);

    }

    @Override
    public void desinscrire(Etudiant etudiant, Cours cours) throws IOException, ClassNotFoundException {
        new InscriptionRepository().desinscrire(cours, etudiant);

    }
}
