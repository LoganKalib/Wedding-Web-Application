package za.ac.cput.reminisce.Data;

import za.ac.cput.reminisce.Models.Gallery;

import java.util.List;

public interface GalleryDaoInterface {
    public List<Gallery> getByWedding(long weddingId);
    public long addOne(Gallery newGallery);
    public boolean deleteOne(long id);
    public Gallery updateOne(long id, Gallery updatedGallery);
}
