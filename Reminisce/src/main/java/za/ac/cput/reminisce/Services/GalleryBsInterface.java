package za.ac.cput.reminisce.Services;

import za.ac.cput.reminisce.Models.Gallery;
import za.ac.cput.reminisce.Models.Organizer;

import java.util.List;

public interface GalleryBsInterface {
    public List<Gallery> getByWedding(long weddingId);
    public long addOne(Gallery newGallery);
    public boolean deleteOne(long id);
    public Gallery updateOne(long id, Gallery updatedGallery);

    public void init();
    public void destroy();
}
