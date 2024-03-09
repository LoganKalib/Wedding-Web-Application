package za.ac.cput.reminisce.Services.Gallery;

import za.ac.cput.reminisce.Models.Gallery.Gallery;

import java.util.List;

public interface GalleryBsInterface {
    public List<Gallery> getByWedding(long weddingId);
    public long addOne(Gallery newGallery);
    public boolean deleteOne(long id);
    public Gallery updateOne(long id, Gallery updatedGallery);

    public void init();
    public void destroy();
}
