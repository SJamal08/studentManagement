package achProject.repository;

import java.io.IOException;
import java.util.ArrayList;

public interface IRepository<T> {

    void create(T object) throws IOException, ClassNotFoundException;
    ArrayList findAll() throws IOException, ClassNotFoundException;
    T findOne(int code) throws IOException, ClassNotFoundException;
    void update(T object) throws IOException, ClassNotFoundException;
    void delete(int id) throws IOException, ClassNotFoundException;

}
