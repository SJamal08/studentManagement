package achProject.utils.dataFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization<T> {

    public void serializeObject(String filePath, T object) throws IOException {
        try {
            File file =  new File(filePath) ;
            ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(file)) ;
            oos.writeObject(object) ;
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> deserializeObject(String filePath) throws IOException, ClassNotFoundException {

        List<T> list= new ArrayList<>();
        try {
            File file =  new File(filePath) ;
            ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
            list= (List<T>) ois.readObject();
        } catch (OptionalDataException | EOFException e) {
            e.printStackTrace();
        }
        return list;
    }
}


