package za.ac.cput.reminisce.Services.MenuItem;

import za.ac.cput.reminisce.Models.MenuItem.MenuItem;

import java.util.List;

public interface MenuItemBsInterface {
    public List<MenuItem> getByMenuId(long id);
    public long addOne(MenuItem newMenuItem);
    public boolean deleteOne(long id);
    public MenuItem updateOne(MenuItem updatedMenuItem);

    public void init();
    public void destroy();
}
