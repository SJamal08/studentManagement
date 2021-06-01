package achProject.repository;

import achProject.model.Cours;
import achProject.model.Etudiant;

import java.io.IOException;

public class InscriptionRepository {

    private CoursRepository coursRepository;
    private EtudiantRepository etudiantRepository;

    public void inscrire(Cours cours, Etudiant etudiant ) throws IOException, ClassNotFoundException {

        if(cours.getEtudiantList().size()< cours.getNbreMaxEtu()) {

            cours.getEtudiantList().add(etudiant);
            etudiant.getListCoursInscrits().add(cours);

            coursRepository.update(cours);
            etudiantRepository.update(etudiant);
        }
    }

    public void desinscrire(Cours cours, Etudiant etudiant ) throws IOException, ClassNotFoundException {

            cours.getEtudiantList().remove(etudiant);
            etudiant.getListCoursInscrits().remove(cours);

            coursRepository.update(cours);
            etudiantRepository.update(etudiant);

    }
}
