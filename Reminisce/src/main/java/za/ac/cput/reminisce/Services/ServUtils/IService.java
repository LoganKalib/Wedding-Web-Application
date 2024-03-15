package za.ac.cput.reminisce.Services.ServUtils;

import java.util.List;

public interface IService <T,ID>{

    public T create(T obj);
    public List<T> read(List<ID> id);
    public boolean delete(T obj);
}
