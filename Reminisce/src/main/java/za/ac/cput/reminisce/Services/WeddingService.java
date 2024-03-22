package za.ac.cput.reminisce.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.reminisce.Models.Seating;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Repository.IWeddingRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class WeddingService implements IService<Wedding,Long> {
    @Autowired
    private IWeddingRepository weddingRepository;

    @Override
    public Wedding create(Wedding obj) {
        try{
            return weddingRepository.save(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Wedding> read(List<Long> id) {
        try{
            return (List<Wedding>) weddingRepository.findAllById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Wedding obj) {
        try{
            if(weddingRepository.existsById(obj.getEventId()))
                weddingRepository.delete(obj);
            return !weddingRepository.existsById(obj.getEventId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
