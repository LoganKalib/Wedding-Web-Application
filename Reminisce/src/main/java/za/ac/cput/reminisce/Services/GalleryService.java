package za.ac.cput.reminisce.Services;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import za.ac.cput.reminisce.Models.Gallery;
import za.ac.cput.reminisce.Repository.IGalleryRepository;
import za.ac.cput.reminisce.Services.ServUtils.IService;

import java.util.List;

@Service
public class GalleryService implements IService<Gallery, Long> {

    private final IGalleryRepository galleryRepository;

    @Autowired
    public GalleryService(@Valid IGalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    @Override
    @Validated
    public Gallery create(@Valid Gallery obj) {
        try{
            return galleryRepository.save(obj);
        } catch(Exception e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return null;
    }

    @Override
    @Validated
    public List<Gallery> read(@Valid List<Long> aLong) {
        try{
            return (List<Gallery>) galleryRepository.findAllById(aLong);
        }catch(Exception e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return null;
    }

    @Override
    @Validated
    public boolean delete(@Valid Gallery obj) {
        try{
            galleryRepository.delete(obj);
            return !galleryRepository.existsById(obj.getGalleryId());
        }catch(Exception e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return false;
    }
}
