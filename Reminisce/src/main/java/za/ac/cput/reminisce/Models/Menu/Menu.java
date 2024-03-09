package za.ac.cput.reminisce.Models.Menu;

public class Menu {
    private long menuId,eventId;
    private String type;

    private Menu(){}
    private Menu(Builder object){
        this.menuId = object.menuId;
        this.eventId = object.eventId;
        this.type = object.type;
    }

    public long getMenuId() {
        return menuId;
    }

    public long getEventId() {
        return eventId;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", eventId=" + eventId +
                ", type='" + type + '\'' +
                '}';
    }

    public static class Builder{
        private long menuId,eventId;
        private String type;

        public Builder setMenuId(long menuId) {
            this.menuId = menuId;
            return this;
        }

        public Builder setEventId(long eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder copy(Menu object){
            this.menuId = object.menuId;
            this.eventId = object.eventId;
            this.type = object.type;
            return this;
        }
        public Menu build(){
            return new Menu(this);
        }
    }
}
