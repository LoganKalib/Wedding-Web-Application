package za.ac.cput.reminisce.Services;

import jakarta.validation.Valid;
import jdk.jfr.Experimental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.Guest;
import za.ac.cput.reminisce.Repository.IGuestRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class GuestService implements IService<Guest,Long> {
    private final IGuestRepository guestRepository;
    @Autowired
    public GuestService(IGuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public Guest create(Guest obj) {
        try{
            return guestRepository.save(obj);
        }catch(Exception e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return null;
    }

    @Override
    public List<Guest> read(List<Long> id) {
        try{
            return (List<Guest>) guestRepository.findAllById(id);
        } catch(Exception e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return null;
    }

    @Override
    public boolean delete(Guest obj) {
        try{
            guestRepository.delete(obj);
            return !guestRepository.existsById(obj.getGuestId());
        }catch(Exception e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return false;
    }
}
