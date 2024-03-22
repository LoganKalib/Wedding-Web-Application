package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.MenuItem;
import za.ac.cput.reminisce.Repository.IMenuItemRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class MenuItemService implements IService<MenuItem,Long> {
    @Autowired
    private IMenuItemRepository menuItemRepository;

    @Override
    public MenuItem create(MenuItem obj) {
        try{
            return menuItemRepository.save(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<MenuItem> read(List<Long> id) {
        try{
            return (List<MenuItem>) menuItemRepository.findAllById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(MenuItem obj) {
        try{
            if(menuItemRepository.existsById(obj.getMenuItemId()))
                menuItemRepository.delete(obj);
            return !menuItemRepository.existsById(obj.getMenuItemId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
