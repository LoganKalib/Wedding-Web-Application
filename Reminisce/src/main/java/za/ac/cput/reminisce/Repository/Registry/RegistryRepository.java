package za.ac.cput.reminisce.Repository.Registry;

import za.ac.cput.reminisce.Models.Registry.Registry;

import java.util.List;

public class RegistryRepository implements IRegistryRepository{
    @Override
    public List<Registry> getByEventId(Long id) {
        return null;
    }

    @Override
    public List<Registry> getByGuestId(Long id) {
        return null;
    }

    @Override
    public Registry create(Registry obj) {
        return null;
    }

    @Override
    public Registry read(Long aLong) {
        return null;
    }

    @Override
    public Registry update(Registry obj) {
        return null;
    }

    @Override
    public boolean delete(Long aLong) {
        return false;
    }

    @Override
    public List<Registry> getAll() {
        return null;
    }
}
