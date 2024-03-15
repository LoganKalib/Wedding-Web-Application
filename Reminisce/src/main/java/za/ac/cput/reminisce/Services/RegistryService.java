package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Repository.IRegistryRepository;

@Service
public class RegistryService {
    @Autowired
    private IRegistryRepository registryRepository;
}
