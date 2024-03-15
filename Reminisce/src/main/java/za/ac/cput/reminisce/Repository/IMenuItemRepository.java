package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.MenuItem;

import java.util.List;

public interface IMenuItemRepository extends CrudRepository<MenuItem, Long> {
}
