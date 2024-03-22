package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.Registry;
import za.ac.cput.reminisce.Models.Rsvp;
import za.ac.cput.reminisce.Repository.IRsvpRepository;
import za.ac.cput.reminisce.Repository.ISeatingRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class RsvpService implements IService<Rsvp,Long> {
    @Autowired
    private IRsvpRepository rsvpRepository;

    @Override
    public Rsvp create(Rsvp obj) {
        try{
            return rsvpRepository.save(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Rsvp> read(List<Long> id) {
        try{
            return (List<Rsvp>) rsvpRepository.findAllById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Rsvp obj) {
        try{
            if(rsvpRepository.existsById(obj.getRsvpId()))
                rsvpRepository.delete(obj);
            return !rsvpRepository.existsById(obj.getRsvpId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
