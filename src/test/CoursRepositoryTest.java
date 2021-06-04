package test;

import achProject.model.Cours;
import achProject.model.Etudiant;
import achProject.repository.CoursRepository;
import achProject.utils.Serialization;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoursRepositoryTest {

    private CoursRepository coursRepository = new CoursRepository();
    private Serialization serializer = new Serialization();
    private static String coursFilePath = "./src/achProject/utils/dataFile/cours.ser";

    @Test
    void create() throws IOException, ClassNotFoundException {
        Cours cours = new Cours("MTH","Maths",30);

        System.out.println(cours.toString());
        coursRepository.create(cours);
        List<Cours> list = (List<Cours>) serializer.deserializeObject(coursRepository.getCoursFilePath());
        System.out.println(list.get(list.size()-1).toString());
        assertTrue((list.get(list.size()-1).getId()==list.size()-1));

    }

    @Test
    void findAll() throws IOException, ClassNotFoundException {
        ArrayList list = coursRepository.findAll();
        assertFalse(list.isEmpty());
            }

    @Test
    void findOne() throws IOException, ClassNotFoundException {
        assertFalse(coursRepository.findOne(0)==null);
    }

    @Test
    void update() throws IOException, ClassNotFoundException {

        Cours cours = new Cours("PC","Physique",30);

        ArrayList list= (ArrayList) serializer.deserializeObject(coursFilePath);
        cours.setId(list.size()-1);

        coursRepository.update(cours);

         list= (ArrayList) serializer.deserializeObject(coursFilePath);


        Cours coursUpdated = (Cours) list.get(cours.getId());

        assertTrue(cours.getTitre().equals(coursUpdated.getTitre()));


    }

    @Test
    void delete() throws IOException, ClassNotFoundException {

        ArrayList arrayList = (ArrayList) serializer.deserializeObject(coursFilePath);
        int sizeBefore = arrayList.size();
        coursRepository.delete(arrayList.size()-1);

         arrayList = (ArrayList) serializer.deserializeObject(coursFilePath);

         assertEquals(sizeBefore-1, arrayList.size());
    }
}