package za.ac.cput.reminisce.Models;

public class MenuItem {
    private long menuItemId, menuId;
    private String title,ingredients;

    public long getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public MenuItem() {
    }

    public MenuItem(long menuItemId, long menuId, String title, String ingredients) {
        this.menuItemId = menuItemId;
        this.menuId = menuId;
        this.title = title;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuItemId=" + menuItemId +
                ", menuId=" + menuId +
                ", title='" + title + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
