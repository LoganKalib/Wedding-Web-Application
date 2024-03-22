package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Gallery;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class GalleryFactory {

    public static Gallery buildGallery(Long glryId, Wedding eventId, String title, byte[] path){
        if(BuilderUtil.isNullOrEmpty(glryId)
                && BuilderUtil.isNullOrEmpty(eventId.getEventId())
                && BuilderUtil.isNullOrEmpty(title)
                && path!=null)

                return new Gallery.Builder().setGalleryId(glryId)
                .setEventId(eventId)
                .setTitle(title)
                .setPath(path)
                .build();
        return null;
    }
    public static Gallery buildGallery(Wedding eventId, String title, byte[] path){
        if(BuilderUtil.isNullOrEmpty(eventId.getEventId())
                && BuilderUtil.isNullOrEmpty(title)
                && path !=null)
                return new Gallery.Builder().setGalleryId(BuilderUtil.genId())
                .setEventId(eventId)
                .setTitle(title)
                .setPath(path)
                .build();
        return null;
    }
}
