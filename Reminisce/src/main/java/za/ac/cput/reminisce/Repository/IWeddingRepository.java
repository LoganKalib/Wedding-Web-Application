package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.Wedding;

import java.util.List;

public interface IWeddingRepository extends CrudRepository<Wedding, Long> {
}
