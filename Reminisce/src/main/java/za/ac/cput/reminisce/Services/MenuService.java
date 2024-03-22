package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.Menu;
import za.ac.cput.reminisce.Models.MenuItem;
import za.ac.cput.reminisce.Repository.IMenuRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class MenuService implements IService<Menu,Long> {
    @Autowired
    private IMenuRepository menuRepository;

    @Override
    public Menu create(Menu obj) {
        try{
            return menuRepository.save(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Menu> read(List<Long> id) {
        try{
            return (List<Menu>) menuRepository.findAllById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Menu obj) {
        try{
            if(menuRepository.existsById(obj.getMenuId()))
                menuRepository.delete(obj);
            return !menuRepository.existsById(obj.getMenuId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
