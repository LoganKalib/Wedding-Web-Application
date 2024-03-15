package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.Gallery;

import java.util.List;

public interface IGalleryRepository extends CrudRepository<Gallery, Long> {

}
