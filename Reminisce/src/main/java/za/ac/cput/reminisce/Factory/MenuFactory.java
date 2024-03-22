package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Menu;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class MenuFactory {
    public static Menu buildMenu(Long menuId, Wedding eventId, String type){
        if(BuilderUtil.isNullOrEmpty(menuId) && BuilderUtil.isNullOrEmpty(type))
            return new Menu.Builder()
                    .setMenuId(menuId)
                    .setEventId(eventId)
                    .setType(type).build();
        return null;
    }
    public static Menu buildMenu(Wedding eventId, String type){
        if(BuilderUtil.isNullOrEmpty(type))
            return new Menu.Builder()
                    .setMenuId(BuilderUtil.genId())
                    .setEventId(eventId)
                    .setType(type).build();
        return null;
    }
}
