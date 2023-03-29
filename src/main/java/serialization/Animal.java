package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Animal implements Serializable {

    private String specie;

    public Animal(String specie) {
        this.specie = specie;
    }

    public ObjectInputStream readObject() throws NotSerializableException {
        throw new NotSerializableException();
    }
}
