package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Menu;
import za.ac.cput.reminisce.Models.MenuItem;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class MenuItemFactory {

    public static MenuItem buildMenuItem(Long menuItemId, Menu menuId, String title, String ingredients){
        if(BuilderUtil.isNullOrEmpty(menuItemId)
                && BuilderUtil.isNullOrEmpty(title)
                && BuilderUtil.isNullOrEmpty(ingredients))
            return new MenuItem.Builder()
                    .setMenuItemId(menuItemId)
                    .setMenuId(menuId)
                    .setTitle(title)
                    .setIngredients(ingredients)
                    .build();
        return null;
    }
    public static MenuItem buildMenuItem(Menu menuId, String title, String ingredients){
        if(BuilderUtil.isNullOrEmpty(title)
                && BuilderUtil.isNullOrEmpty(ingredients))
            return new MenuItem.Builder()
                    .setMenuItemId(BuilderUtil.genId())
                    .setMenuId(menuId)
                    .setTitle(title)
                    .setIngredients(ingredients)
                    .build();
        return null;
    }
}
