package core.basesyntax;

import java.util.ArrayList;
import java.util.HashMap;

public class Car implements Cloneable {
    private Engine engine;
    private String number;
    private ArrayList<String> documentation;
    private HashMap<String, Integer> map;
    private final int max_speed;

    private int getSpeed() {
        return this.max_speed;
    }

    public Car(int maxSpeed, ArrayList<String> documentation,
               String number, Engine engine, HashMap<String, Integer> map) {
        this.max_speed = maxSpeed;
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
            clone.engine = new Engine(this.engine);
            clone.documentation = new ArrayList<>(this.documentation);
            clone.map = new HashMap<>(this.map);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
