package core.basesyntax;

public class Car implements Cloneable {

    private String model;
    private Engine ownEngine;
    private String color;
    private String transmission;
    private int speed;

    public Car(String model, Engine ownEngine, String color, String transmission, int speed) {
        this.model = model;
        this.ownEngine = ownEngine;
        this.color = color;
        this.transmission = transmission;
        this.speed = speed;
    }

    @Override

    public Car clone() throws CloneNotSupportedException {
        return new Car(model, ownEngine.clone(), color, transmission, speed);
    }
}
