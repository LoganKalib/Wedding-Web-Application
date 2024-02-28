package za.ac.cput.reminisce.Services;

import za.ac.cput.reminisce.Models.Menu;

import java.util.List;

public class MenuBs implements MenuBsInterface{
    @Override
    public Menu getById(long id) {
        return null;
    }

    @Override
    public List<Menu> getAllMenu(long WeddingId) {
        return null;
    }

    @Override
    public long addOne(Menu newMenu) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Menu updateOne(long id, Menu updatedMenu) {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
