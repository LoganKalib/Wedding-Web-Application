package za.ac.cput.reminisce.Services.Menu;



import za.ac.cput.reminisce.Models.Menu.Menu;

import java.util.List;

public interface MenuBsInterface {
    public Menu getById(long id);
    public List<Menu> getAllMenu(long WeddingId);
    public long addOne(Menu newMenu);
    public boolean deleteOne(long id);
    public Menu updateOne(long id, Menu updatedMenu);

    public void init();
    public void destroy();
}
