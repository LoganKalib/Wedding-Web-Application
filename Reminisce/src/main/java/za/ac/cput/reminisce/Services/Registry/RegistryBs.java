package za.ac.cput.reminisce.Services.Registry;

import za.ac.cput.reminisce.Models.Registry.Registry;

import java.util.List;

public class RegistryBs implements RegistryBsInterface{
    @Override
    public Registry getById(long id) {
        return null;
    }

    @Override
    public List<Registry> getRegistry(long WeddingID) {
        return null;
    }

    @Override
    public long addOne(long weddingId, Registry newRegistry) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Registry updateOne(long id, Registry updatedRegistry) {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
