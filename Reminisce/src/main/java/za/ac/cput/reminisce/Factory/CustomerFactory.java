package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class CustomerFactory {

    public static Customer buildCustomer(Long orgId, String email, String password, String name, String surname){
        if(BuilderUtil.isNullOrEmpty(orgId)
                && BuilderUtil.isNullOrEmpty(email)
                && BuilderUtil.isNullOrEmpty(password)
                && BuilderUtil.isNullOrEmpty(name) && BuilderUtil.isNullOrEmpty(surname))
            return new Customer.Builder()
                    .setOrgId(orgId)
                    .setEmail(email)
                    .setPassword(password)
                    .setSurname(surname)
                    .setName(name)
                    .build();
        return null;
    }
    public static Customer buildCustomer(String email, String password, String name, String surname){
        if(BuilderUtil.isNullOrEmpty(email)
                && BuilderUtil.isNullOrEmpty(password)
                && BuilderUtil.isNullOrEmpty(name) && BuilderUtil.isNullOrEmpty(surname))
            return new Customer.Builder()
                    .setOrgId(BuilderUtil.genId())
                    .setEmail(email)
                    .setPassword(password)
                    .setSurname(surname)
                    .setName(name)
                    .build();
        return null;
    }
    public static Customer buildCustomer(String email, String password){
        if(BuilderUtil.isNullOrEmpty(email)
                && BuilderUtil.isNullOrEmpty(password))
            return new Customer.Builder()
                    .setOrgId(BuilderUtil.genId())
                    .setEmail(email)
                    .setPassword(password)
                    .build();
        return null;
    }
}
