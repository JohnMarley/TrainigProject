package Tests.serialization;

import org.junit.Test;
import serialization.Animal;
import serialization.Cat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationsTests {

    @Test
    public void Test() {
        Cat cat = new Cat("SerializableCat", 5);
        Animal animal = new Animal("cat");
        Serializable a = animal;
        try {
            FileOutputStream fos = new FileOutputStream("c:\\ser.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(cat);
            outputStream.writeObject(animal);
            fos.close();
            outputStream.close();

            FileInputStream fis = new FileInputStream("c:\\ser.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            cat = (Cat) inputStream.readObject();
            animal = (Animal) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(animal);
        System.out.println(cat);
    }
}
