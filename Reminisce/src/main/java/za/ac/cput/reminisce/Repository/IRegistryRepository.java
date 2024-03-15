package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.Registry;

import java.util.List;

public interface IRegistryRepository extends CrudRepository<Registry, Long> {
}
