package za.ac.cput.reminisce.Data.Registry;

import za.ac.cput.reminisce.Data.IEntities;
import za.ac.cput.reminisce.Models.Registry.Registry;

import java.util.List;

public interface RegistryDaoInterface extends IEntities<Registry> {
    public Registry getById(long id);
    public List<Registry> getRegistry(long WeddingID);

}
