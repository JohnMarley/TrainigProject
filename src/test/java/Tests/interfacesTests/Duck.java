package Tests.interfacesTests;

import interfaces.Run;
import interfaces.Swim;

public class Duck implements Run, Swim {

    public void stay(){
        System.out.println("stay!");
    }
}
