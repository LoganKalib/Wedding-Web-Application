package za.ac.cput.reminisce.Repository;

import java.util.List;

public interface IRepository <T,ID>{
    T create(T obj);
    T read(ID id);
    T update(T obj);
    boolean delete(ID id);
    List<T> getAll();
}
