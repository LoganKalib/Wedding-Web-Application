package za.ac.cput.reminisce.Services;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.multipart.MultipartFile;
import za.ac.cput.reminisce.Models.Gallery;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Repository.IGalleryRepository;
import za.ac.cput.reminisce.Services.ServUtils.IGalleryService;
import za.ac.cput.reminisce.Utils.ImageUtil;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static za.ac.cput.reminisce.Factory.GalleryFactory.buildGallery;

@Service
public class GalleryService implements IGalleryService{

    private final IGalleryRepository galleryRepository;

    @Autowired
    public GalleryService(@Valid IGalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    @Override
    public Gallery upload( MultipartFile file, Wedding eventId) {
        try {
            return galleryRepository.save(Objects.requireNonNull(buildGallery(eventId,
                    file.getOriginalFilename(),
                    ImageUtil.compressImage(file.getBytes())
            )));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Gallery> download(Long glryId) {
        try{
            Optional<Gallery> item =  galleryRepository.findById(glryId);
            item.ifPresent(gallery -> ImageUtil.decompressImage(gallery.getPath()));
            return item;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Gallery create(Gallery obj) {
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
