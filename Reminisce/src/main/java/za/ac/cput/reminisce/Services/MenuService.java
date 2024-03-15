package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Repository.IMenuRepository;

@Service
public class MenuService {
    @Autowired
    private IMenuRepository menuRepository;
}
