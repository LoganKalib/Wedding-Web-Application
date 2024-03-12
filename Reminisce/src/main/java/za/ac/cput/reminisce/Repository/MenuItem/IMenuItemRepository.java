package za.ac.cput.reminisce.Repository.MenuItem;

import za.ac.cput.reminisce.Models.MenuItem.MenuItem;
import za.ac.cput.reminisce.Repository.IRepository;

import java.util.List;

public interface IMenuItemRepository extends IRepository<MenuItem, Long> {
    List<MenuItem> getByMenu(Long id);
}
