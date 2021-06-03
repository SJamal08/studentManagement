package achProject.repository;

import achProject.model.Etudiant;
import achProject.utils.Serialization;

import java.io.IOException;
import java.util.ArrayList;

public class EtudiantRepository implements IRepository<Etudiant>{

    public final static String etudiantsFilePath = "./src/achProject/utils/dataFile/etudiants.ser";

    Serialization serializer = new Serialization();

    @Override
    public void create(Etudiant etudiant) throws IOException, ClassNotFoundException {

        ArrayList list = (ArrayList) serializer.deserializeObject(etudiantsFilePath);
        etudiant.setId(list.size());
        list.add(etudiant);
        serializer.serializeObject(etudiantsFilePath,list);

    }

    @Override
    public ArrayList findAll() throws IOException, ClassNotFoundException {

        return (ArrayList) serializer.deserializeObject(etudiantsFilePath);
    }


    @Override
    public Etudiant findOne(int id) throws IOException, ClassNotFoundException {
        ArrayList list = (ArrayList) serializer.deserializeObject(etudiantsFilePath);

        try{
            return (Etudiant) list.get(id);
        } catch (Exception e) {
            System.out.println("Not found");
        }
        return null;
    }

    @Override
    public void update(Etudiant etudiant) throws IOException, ClassNotFoundException {

        ArrayList list = (ArrayList) serializer.deserializeObject(etudiantsFilePath);
        list.set(etudiant.getId(), etudiant);

        serializer.serializeObject(etudiantsFilePath,list);

    }

    @Override
    public void delete(int id) throws IOException, ClassNotFoundException {

        ArrayList list = (ArrayList) serializer.deserializeObject(etudiantsFilePath);

        list.remove(id);

        serializer.serializeObject(etudiantsFilePath,list);

    }

    public static String getEtudiantsFilePath() {
        return etudiantsFilePath;
    }
}
