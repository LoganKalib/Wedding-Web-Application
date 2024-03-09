package za.ac.cput.reminisce.Data.Menu;

import za.ac.cput.reminisce.Models.Menu.Menu;

import java.util.List;

public class MenuDataService implements MenuDaoInterface{
    @Override
    public boolean addOne(Menu newObject) {
        return false;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Menu updateOne(long id, Menu updatedObject) {
        return null;
    }

    @Override
    public Menu getById(long id) {
        return null;
    }

    @Override
    public List<Menu> getAllMenu(long WeddingId) {
        return null;
    }
}
