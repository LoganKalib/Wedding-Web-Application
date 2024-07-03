package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.reminisce.Models.MenuItem;

import java.util.List;

@Repository
public interface IMenuItemRepository extends CrudRepository<MenuItem, Long> {
}
