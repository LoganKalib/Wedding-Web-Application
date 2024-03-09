package za.ac.cput.reminisce.Models.Gallery;

public class Gallery {
    private long galleryId, eventId;
    private String title, path;

    private Gallery(){}
    private Gallery(Builder object){
        this.eventId = object.eventId;
        this.galleryId = object.galleryId;
        this.path = object.path;
        this.title = object.title;
    }

    public long getGalleryId() {
        return galleryId;
    }

    public long getEventId() {
        return eventId;
    }

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "galleryId=" + galleryId +
                ", eventId=" + eventId +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public static class Builder {
        private long galleryId, eventId;
        private String title, path;

        public Builder setGalleryId(long galleryId) {
            this.galleryId = galleryId;
            return this;
        }

        public Builder setEventId(long eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder copy(Gallery gallery){
            this.eventId = gallery.eventId;
            this.galleryId = gallery.galleryId;
            this.path = gallery.path;
            this.title = gallery.title;
            return this;
        }

        public Gallery build(){
            return new Gallery(this);
        }
    }
}
