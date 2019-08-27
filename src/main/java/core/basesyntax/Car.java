package core.basesyntax;

import java.util.ArrayList;
import java.util.HashMap;

public class Car implements Cloneable {
    private Engine engine;
    private String number;
    private ArrayList<String> documentation;
    private HashMap<String, Integer> map;
    private final int maxSpeed;

    private int getSpeed() {
        return this.maxSpeed;
    }

    public Car(int maxSpeed, ArrayList<String> documentation,
               String number, Engine engine, HashMap<String, Integer> map) {
        this.maxSpeed = maxSpeed;
        this.documentation = documentation;
        this.number = number;
        this.engine = engine;
        this.map = map;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car clone = null;
        try {
            clone = (Car) super.clone();
            clone.engine = this.engine.clone();
            clone.documentation = new ArrayList<>(documentation);
            clone.map = new HashMap<>(map);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
