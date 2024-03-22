package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.Rsvp;
import za.ac.cput.reminisce.Models.Seating;
import za.ac.cput.reminisce.Repository.ISeatingRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class SeatingService implements IService<Seating, Long> {
    @Autowired
    private ISeatingRepository seatingRepository;

    @Override
    public Seating create(Seating obj) {
        try{
            return seatingRepository.save(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Seating> read(List<Long> id) {
        try{
            return (List<Seating>) seatingRepository.findAllById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Seating obj) {
        try{
            if(seatingRepository.existsById(obj.getSeatingId()))
                seatingRepository.delete(obj);
            return !seatingRepository.existsById(obj.getSeatingId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
