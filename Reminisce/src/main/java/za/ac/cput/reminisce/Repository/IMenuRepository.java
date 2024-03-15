package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.Menu;

import java.util.List;

public interface IMenuRepository extends CrudRepository<Menu, Long> {
}
