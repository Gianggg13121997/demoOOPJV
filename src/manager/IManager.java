package manager;

import model.Clazz;

import java.util.List;

public interface IManager <T>{
    void add(T t);
    void update(int id , T t);
    void delete(int id);
    List<T> getAll();
    int findIndexById(int id);

}
