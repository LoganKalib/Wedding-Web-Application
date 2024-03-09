package za.ac.cput.reminisce.Data.Gallery;

import za.ac.cput.reminisce.Data.IEntities;
import za.ac.cput.reminisce.Models.Gallery.Gallery;

import java.util.List;

public interface GalleryDaoInterface extends IEntities<Gallery> {
    public List<Gallery> getByWedding(long weddingId);

}
