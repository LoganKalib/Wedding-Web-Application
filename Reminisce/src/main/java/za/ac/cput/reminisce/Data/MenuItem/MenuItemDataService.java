package za.ac.cput.reminisce.Data.MenuItem;

import za.ac.cput.reminisce.Models.MenuItem.MenuItem;

import java.util.List;

public class MenuItemDataService implements MenuItemDaoInterface{
    @Override
    public boolean addOne(MenuItem newObject) {
        return false;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public MenuItem updateOne(long id, MenuItem updatedObject) {
        return null;
    }

    @Override
    public List<MenuItem> getByMenuId(long id) {
        return null;
    }
}
