package test;

import achProject.model.Cours;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoursTest {

    Cours cours = new Cours("PC","Physique",30);


    @Test
    void getSigle() {

        String sigle =cours.getSigle();
        assertEquals("PC" , sigle);
    }

    @Test
    void setSigle() {

        cours.setSigle("MTH");
        assertEquals("MTH" , cours.getSigle());
    }

    @Test
    void getTitre() {
        String titre =cours.getTitre();
        assertEquals("Physique" , titre);
    }

    @Test
    void setTitre() {
        cours.setTitre("Maths");
        assertEquals("Maths" , cours.getTitre());
    }

    @Test
    void getNbreMaxEtu() {

        assertEquals(30 , cours.getNbreMaxEtu());
    }

    @Test
    void setNbreMaxEtu() {

        cours.setNbreMaxEtu(25);
        assertEquals(25 , cours.getNbreMaxEtu());

    }

    @Test
    void testToString() {

        String toString = "Cours{id=0, sigle='PC', titre='Physique', nbreMaxEtu=30, etudiantList=[], prerequis=[]}";

        assertEquals(toString, cours.toString());
    }
}