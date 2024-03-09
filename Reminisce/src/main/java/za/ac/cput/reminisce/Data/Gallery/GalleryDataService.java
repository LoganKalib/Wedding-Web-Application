package za.ac.cput.reminisce.Data.Gallery;

import za.ac.cput.reminisce.Models.Gallery.Gallery;

import java.util.List;

public class GalleryDataService implements GalleryDaoInterface{
    @Override
    public List<Gallery> getByWedding(long weddingId) {
        return null;
    }

    @Override
    public boolean addOne(Gallery newObject) {
        return false;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Gallery updateOne(long id, Gallery updatedObject) {
        return null;
    }
}
