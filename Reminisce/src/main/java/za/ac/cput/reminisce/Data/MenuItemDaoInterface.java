package za.ac.cput.reminisce.Data;

import za.ac.cput.reminisce.Models.MenuItem;

import java.util.List;

public interface MenuItemDaoInterface {
    public List<MenuItem> getByMenuId(long id);
    public long addOne(MenuItem newMenuItem);
    public boolean deleteOne(long id);
    public MenuItem updateOne(MenuItem updatedMenuItem);
}
