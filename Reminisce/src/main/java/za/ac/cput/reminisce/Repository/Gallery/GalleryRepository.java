package za.ac.cput.reminisce.Repository.Gallery;

import za.ac.cput.reminisce.Models.Gallery.Gallery;

import java.util.List;

public class GalleryRepository implements IGalleryRepository{
    @Override
    public List<Gallery> getByEventId(Long id) {
        return null;
    }

    @Override
    public Gallery create(Gallery obj) {
        return null;
    }

    @Override
    public Gallery read(Long aLong) {
        return null;
    }

    @Override
    public Gallery update(Gallery obj) {
        return null;
    }

    @Override
    public boolean delete(Long aLong) {
        return false;
    }

    @Override
    public List<Gallery> getAll() {
        return null;
    }
}
