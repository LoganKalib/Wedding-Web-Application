package za.ac.cput.reminisce.Models;

public class Menu {
    private long menuId,eventId;
    private String type;

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Menu() {
    }

    public Menu(long menuId, long eventId, String type) {
        this.menuId = menuId;
        this.eventId = eventId;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", eventId=" + eventId +
                ", type='" + type + '\'' +
                '}';
    }
}
