package serialization;

import java.io.IOException;
import java.io.Serializable;

public class Cat extends Animal implements Serializable {

    private String name;
    private int age;

    public Cat(String name, int age) {
        super("test");
        this.name = name;
        this.age = age;
    }

}
