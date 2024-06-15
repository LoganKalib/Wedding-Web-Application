package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Models.Registry;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class RegistryFactory {

    public static Registry buildRegistry(Long registryId, Wedding eventId, Customer custId, String title, String link, String status, float price){
        if(BuilderUtil.isNullOrEmpty(registryId)
                && BuilderUtil.isNullOrEmpty(title)
                && BuilderUtil.isNullOrEmpty(link)
                && BuilderUtil.isNullOrEmpty(status))
            return new Registry.Builder()
                    .setRegistryId(registryId)
                    .setEventId(eventId)
                    .setCustId(custId)
                    .setTitle(title)
                    .setLink(link)
                    .setStatus(status)
                    .setPrice(price).build();
        return null;
    }
    public static Registry buildRegistry(Wedding eventId, Customer custId, String title, String link, String status, float price){
        if(BuilderUtil.isNullOrEmpty(title)
                && BuilderUtil.isNullOrEmpty(link)
                && BuilderUtil.isNullOrEmpty(status))
            return new Registry.Builder()
                    .setRegistryId(BuilderUtil.genId())
                    .setEventId(eventId)
                    .setCustId(custId)
                    .setTitle(title)
                    .setLink(link)
                    .setStatus(status)
                    .setPrice(price).build();
        return null;
    }
}
