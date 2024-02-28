package za.ac.cput.reminisce.Services;

import za.ac.cput.reminisce.Models.Gallery;

import java.util.List;

public class GalleryBs implements GalleryBsInterface{
    @Override
    public List<Gallery> getByWedding(long weddingId) {
        return null;
    }

    @Override
    public long addOne(Gallery newGallery) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Gallery updateOne(long id, Gallery updatedGallery) {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
