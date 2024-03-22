package za.ac.cput.reminisce.Services.ServUtils;

import jakarta.validation.Valid;
import org.springframework.web.multipart.MultipartFile;
import za.ac.cput.reminisce.Models.Gallery;
import za.ac.cput.reminisce.Models.Wedding;

import java.util.Optional;

public interface IGalleryService extends IService<Gallery, Long> {

    public Gallery upload(@Valid MultipartFile file, @Valid Wedding eventId);
    public Optional<Gallery> download(@Valid Long glryId);
}
