package za.ac.cput.reminisce.Repository.Menu;

import za.ac.cput.reminisce.Models.Menu.Menu;
import za.ac.cput.reminisce.Repository.IRepository;

import java.util.List;

public interface IMenuRepository extends IRepository<Menu, Long> {
    List<Menu> getByEventId(Long id);
}
