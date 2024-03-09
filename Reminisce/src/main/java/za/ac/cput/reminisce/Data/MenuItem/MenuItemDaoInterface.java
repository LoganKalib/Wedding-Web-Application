package za.ac.cput.reminisce.Data.MenuItem;

import za.ac.cput.reminisce.Data.IEntities;
import za.ac.cput.reminisce.Models.MenuItem.MenuItem;

import java.util.List;

public interface MenuItemDaoInterface extends IEntities<MenuItem> {
    public List<MenuItem> getByMenuId(long id);

}
