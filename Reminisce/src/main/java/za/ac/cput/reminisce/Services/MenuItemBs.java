package za.ac.cput.reminisce.Services;

import za.ac.cput.reminisce.Models.MenuItem;

import java.util.List;

public class MenuItemBs implements MenuItemBsInterface{
    @Override
    public List<MenuItem> getByMenuId(long id) {
        return null;
    }

    @Override
    public long addOne(MenuItem newMenuItem) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public MenuItem updateOne(MenuItem updatedMenuItem) {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
