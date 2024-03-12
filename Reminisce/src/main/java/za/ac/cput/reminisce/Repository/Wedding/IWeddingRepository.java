package za.ac.cput.reminisce.Repository.Wedding;

import za.ac.cput.reminisce.Models.Wedding.Wedding;
import za.ac.cput.reminisce.Repository.IRepository;

import java.util.List;

public interface IWeddingRepository extends IRepository<Wedding, Long> {
    List<Wedding> getByOrgId(Long id);
}
