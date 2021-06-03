package test;

import achProject.model.Etudiant;
import achProject.repository.EtudiantRepository;
import achProject.utils.Serialization;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantRepositoryTest {

    private EtudiantRepository etudiantRepository = new EtudiantRepository();
    private Serialization serializer = new Serialization();
    private static String etudiantFilePath = EtudiantRepository.getEtudiantsFilePath();

    @Test
    void create() throws IOException, ClassNotFoundException {
        Etudiant etudiant = new Etudiant("Boukari","Achiraf","fake Code");
        System.out.println(etudiant.toString());
        etudiantRepository.create(etudiant);
        List<Etudiant> list = (List<Etudiant>) serializer.deserializeObject(etudiantFilePath);
        System.out.println(list.get(list.size()-1).toString());
        assertTrue((list.get(list.size()-1).getId()==list.size()-1));

    }

    @Test
    void findAll() throws IOException, ClassNotFoundException {
        ArrayList list = etudiantRepository.findAll();
        assertFalse(list.isEmpty());
    }

    @Test
    void findOne() throws IOException, ClassNotFoundException {
        assertFalse(etudiantRepository.findOne(0)==null);
    }

    @Test
    void update() throws IOException, ClassNotFoundException {

        Etudiant etudiant = new Etudiant("Boukari","Jamal","fakeCode");

        ArrayList list= (ArrayList) serializer.deserializeObject(etudiantFilePath);
        etudiant.setId(list.size()-1);

        etudiantRepository.update(etudiant);

        list= (ArrayList) serializer.deserializeObject(etudiantFilePath);


        Etudiant etudiantUpdated = (Etudiant) list.get(etudiant.getId());

        assertTrue(etudiant.getPrenom().equals(etudiantUpdated.getPrenom()));


    }

    @Test
    void delete() throws IOException, ClassNotFoundException {

        ArrayList arrayList = (ArrayList) serializer.deserializeObject(etudiantFilePath);
        int sizeBefore = arrayList.size();
        etudiantRepository.delete(arrayList.size()-1);

        arrayList = (ArrayList) serializer.deserializeObject(etudiantFilePath);

        assertEquals(sizeBefore-1, arrayList.size());
    }

}