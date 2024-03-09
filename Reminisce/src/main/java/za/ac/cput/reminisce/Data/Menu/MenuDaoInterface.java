package za.ac.cput.reminisce.Data.Menu;

import za.ac.cput.reminisce.Data.IEntities;
import za.ac.cput.reminisce.Models.Menu.Menu;

import java.util.List;

public interface MenuDaoInterface extends IEntities<Menu> {
    public Menu getById(long id);
    public List<Menu> getAllMenu(long WeddingId);
}
