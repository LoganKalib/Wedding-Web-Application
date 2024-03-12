package za.ac.cput.reminisce.Repository.Registry;

import za.ac.cput.reminisce.Models.Registry.Registry;
import za.ac.cput.reminisce.Repository.IRepository;

import java.util.List;

public interface IRegistryRepository extends IRepository<Registry, Long> {
    List<Registry> getByEventId(Long id);
    List<Registry> getByGuestId(Long id);
}
