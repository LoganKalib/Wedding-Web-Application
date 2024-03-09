package za.ac.cput.reminisce.Data;

import za.ac.cput.reminisce.Models.Gallery.Gallery;

public interface IEntities <T>{
    public boolean addOne(T newObject);
    public boolean deleteOne(long id);
    public T updateOne(long id, T updatedObject);
}
