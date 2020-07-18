package classes.phoneNumber;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber implements Cloneable{

    String number;
    String name;
    Map<String,String>contact;
    public PhoneNumber(String name,String number){
        contact=new HashMap<>();
        this.name=name;
        this.number=number;
        contact.put(name,number);
    }

    @Override
    public boolean equals(Object object){
        //1st contract rule
        if(object==this){
            return true;
        }
        //2nd contract rule
        if(!(object instanceof PhoneNumber)){
            return false;
        }
        //3rd compare all meaningful fields
        PhoneNumber phoneNumber = (PhoneNumber) object;
        return name.equals(phoneNumber.name) && number.equals(phoneNumber.number);
    }

    @Override
    public int hashCode(){
        int result = name.hashCode();

        return 31*result+number.hashCode();
    }

    @Override
    public PhoneNumber clone(){
        PhoneNumber phoneNumber = null;
        try {
           phoneNumber = (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return phoneNumber;
    }

}
