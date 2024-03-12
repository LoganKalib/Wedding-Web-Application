package za.ac.cput.reminisce.Repository.Gallery;

import za.ac.cput.reminisce.Models.Gallery.Gallery;
import za.ac.cput.reminisce.Repository.IRepository;

import java.util.List;

public interface IGalleryRepository extends IRepository<Gallery, Long> {
    List<Gallery> getByEventId(Long id);
}
