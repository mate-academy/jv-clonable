package core.basesyntax;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Engine implements Cloneable {
    private String manufacturer;
    private String supply;
    private int power;
    private char type;
    private boolean condition;

    @Override
    public Engine clone() {
        Engine copyEngine = new Engine();
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("file.bin"));
             ObjectInputStream input = new ObjectInputStream(new FileInputStream("file.bin"))) {
            output.writeObject(this);
            copyEngine = (Engine)input.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        return copyEngine;
    }
}
