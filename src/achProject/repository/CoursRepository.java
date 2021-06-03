package achProject.repository;

import achProject.model.Cours;
import achProject.utils.Serialization;

import java.io.IOException;
import java.util.ArrayList;


public class CoursRepository implements IRepository<Cours> {


    private static final String coursFilePath = "./src/achProject/utils/dataFile/cours.ser";

    Serialization serializer = new Serialization();


    public static String getCoursFilePath() {
        return coursFilePath;
    }

    @Override
    public void create(Cours cours) throws IOException, ClassNotFoundException {

        ArrayList list = (ArrayList) serializer.deserializeObject(coursFilePath);
        cours.setId(list.size());
        list.add(cours);
        serializer.serializeObject(coursFilePath,list);
    }

    @Override
    public ArrayList findAll() throws IOException, ClassNotFoundException {
        return (ArrayList) serializer.deserializeObject(coursFilePath);}

    @Override
    public Cours findOne(int id) throws IOException, ClassNotFoundException {

        ArrayList list = (ArrayList) serializer.deserializeObject(coursFilePath);

        try{
            return (Cours) list.get(id);
        } catch (Exception e) {
            System.out.println("Not found");
        }
        return null;

    }

    @Override
    public void update(Cours cours) throws IOException, ClassNotFoundException {
        ArrayList list = (ArrayList) serializer.deserializeObject(coursFilePath);
        list.set(cours.getId(), cours);

        serializer.serializeObject(coursFilePath,list);

    }

    @Override
    public void delete(int id) throws IOException, ClassNotFoundException {

        ArrayList list = (ArrayList) serializer.deserializeObject(coursFilePath);

        list.remove(id);

        serializer.serializeObject(coursFilePath,list);

    }

}
