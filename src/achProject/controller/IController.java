package achProject.controller;

import achProject.model.Cours;
import achProject.model.Etudiant;

import java.io.IOException;
import java.util.List;

public interface IController {

    void addEtudiant(Etudiant etudiant) throws IOException, ClassNotFoundException;
    List<Etudiant> findAllEtudiants() throws IOException, ClassNotFoundException;
    Etudiant findOneEtudiant(int id) throws IOException, ClassNotFoundException;
    void updateEtudiant(Etudiant etudiant) throws IOException, ClassNotFoundException;
    void deleteEtudiant(int id) throws IOException, ClassNotFoundException;

    void addCours(Cours cours) throws IOException, ClassNotFoundException;
    List<Cours> findAllCours() throws IOException, ClassNotFoundException;
    Cours findOneCours(int id) throws IOException, ClassNotFoundException;
    void updateCours(Cours cours) throws IOException, ClassNotFoundException;
    void deleteCours(int id) throws IOException, ClassNotFoundException;

    void inscrire(Etudiant etudiant, Cours cours) throws IOException, ClassNotFoundException;
    void desinscrire(Etudiant etudiant, Cours cours) throws IOException, ClassNotFoundException;
}
