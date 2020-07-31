package core.basesyntax;

import java.awt.Color;

public class Car implements Cloneable {
    private Engine engine;
    private int speed;
    private Color color;
    private int yearOfProduction;
    private String owner;

    public Car(Engine engine, int speed, Color color, int yearOfProduction, String owner) {
        this.engine = engine;
        this.speed = speed;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.owner = owner;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        Engine clonedEngine = this.getEngine().clone();
        clonedCar.setEngine(clonedEngine);
        return clonedCar;
    }
}
