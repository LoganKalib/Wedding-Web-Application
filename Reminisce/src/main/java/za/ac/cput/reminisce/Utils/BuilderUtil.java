package za.ac.cput.reminisce.Utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

public class BuilderUtil{

    public static Long genId(){
        try {
            return SecureRandom.getInstanceStrong().nextLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isNullOrEmpty(Long value){
        return value != null && value > 0;
    }
    public static boolean isNullOrEmpty(String value){
        return value != null && !value.isEmpty();
    }
}
