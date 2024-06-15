package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.Registry;
import za.ac.cput.reminisce.Repository.IRegistryRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class RegistryService implements IService<Registry,Long> {
    @Autowired
    private IRegistryRepository registryRepository;

    @Override
    public Registry create(Registry obj) {
        try{
            return registryRepository.save(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Registry> read(List<Long> id) {
        try{
            return (List<Registry>) registryRepository.findAllById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Registry obj) {
        try{
            if(registryRepository.existsById(obj.getRegistryId()))
                registryRepository.delete(obj);
            return !registryRepository.existsById(obj.getRegistryId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
