package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.Organizer;
import za.ac.cput.reminisce.Repository.IOrganizerRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class OrganizerService implements IService<Organizer,Long> {
    @Autowired
    private IOrganizerRepository organizerRepository;

    @Override
    public Organizer create(Organizer obj) {
        try{
            return organizerRepository.save(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Organizer> read(List<Long> id) {
        try{
            return (List<Organizer>) organizerRepository.findAllById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Organizer obj) {
        try{
            if(organizerRepository.existsById(obj.getOrgId()))
                organizerRepository.delete(obj);
            return !organizerRepository.existsById(obj.getOrgId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
