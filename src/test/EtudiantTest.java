package test;

import achProject.model.Etudiant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantTest {

    Etudiant etudiant = new Etudiant("Boukari","Achiraf","fake Code");

    @Test
    void getNom() {

        assertEquals("Boukari" ,etudiant.getNom() );
    }

    @Test
    void setNom() {
        etudiant.setNom("Boukariiiiiii");
        assertEquals("Boukariiiiiii" ,etudiant.getNom() );
    }

    @Test
    void getPrenom() {
        assertEquals("Achiraf" ,etudiant.getPrenom() );

    }

    @Test
    void setPrenom() {
        etudiant.setPrenom("Jamal");
        assertEquals("Jamal" , etudiant.getPrenom());
    }

    @Test
    void getCodeEtu() {
        assertEquals("fake Code" , etudiant.getCodeEtu());
    }

    @Test
    void setCodeEtu() {

        etudiant.setCodeEtu("my-fake-code");
        assertEquals("my-fake-code" , etudiant.getCodeEtu());
    }
}