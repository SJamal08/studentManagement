package test;

import achProject.model.Cours;
import achProject.model.Etudiant;
import achProject.repository.CoursRepository;
import achProject.repository.EtudiantRepository;
import achProject.repository.InscriptionRepository;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InscriptionRepositoryTest {

    private InscriptionRepository inscriptionRepository = new InscriptionRepository();
    private CoursRepository coursRepository = new CoursRepository();
    private EtudiantRepository etudiantRepository = new EtudiantRepository();

    @Test
    void inscrire() throws IOException, ClassNotFoundException {

        Cours cours = new Cours("MTH","Maths",30);
        cours.setId(0);


        Etudiant etudiant = new Etudiant("Boukari","Jamal","fakeCode");
        etudiant.setId(0);

        inscriptionRepository.inscrire(cours, etudiant);

        assertFalse(etudiantRepository.findOne(0).getListCoursInscrits().isEmpty());

        assertFalse(coursRepository.findOne(0).getEtudiantList().isEmpty());



    }

    @Test
    void desinscrire() {
    }
}