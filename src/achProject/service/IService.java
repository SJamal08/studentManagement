package achProject.service;

import java.io.IOException;

public interface IService {

    void ReadFile() throws IOException, ClassNotFoundException;
    void inscriptionEtudiant() throws IOException, ClassNotFoundException;
    void displayEtudiantInCours() throws IOException, ClassNotFoundException;
    void displayAllEtudiants() throws IOException, ClassNotFoundException;
    void displayAllCours() throws IOException, ClassNotFoundException;
    void displayAllCoursOfOneEtudiant() throws IOException, ClassNotFoundException;
    void addEtudiant() throws IOException, ClassNotFoundException;
    void addCours() throws IOException, ClassNotFoundException;
    void deleteEtudiant() throws IOException, ClassNotFoundException;
    void deleteCours() throws IOException, ClassNotFoundException;
    void updateEtudiant() throws IOException, ClassNotFoundException;
    void updateCours() throws IOException, ClassNotFoundException;
}
