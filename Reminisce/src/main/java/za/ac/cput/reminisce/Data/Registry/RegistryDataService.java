package za.ac.cput.reminisce.Data.Registry;

import za.ac.cput.reminisce.Models.Registry.Registry;

import java.util.List;

public class RegistryDataService implements RegistryDaoInterface{
    @Override
    public boolean addOne(Registry newObject) {
        return false;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Registry updateOne(long id, Registry updatedObject) {
        return null;
    }

    @Override
    public Registry getById(long id) {
        return null;
    }

    @Override
    public List<Registry> getRegistry(long WeddingID) {
        return null;
    }
}
