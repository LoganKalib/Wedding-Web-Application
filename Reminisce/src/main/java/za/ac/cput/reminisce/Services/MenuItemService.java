package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Repository.IMenuItemRepository;

@Service
public class MenuItemService {
    @Autowired
    private IMenuItemRepository menuItemRepository;
}
