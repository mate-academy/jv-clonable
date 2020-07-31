package core.basesyntax;

public class Car implements Cloneable {

    private String model;
    private int number;
    private String color;
    private int maxSpeed;
    private Engine engine;

    public Car(String model, int number, String color, int maxSpeed, Engine engine) {
        this.model = model;
        this.number = number;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public void setModel() {
        this.model = model;
    }

    public void setNumber() {
        this.number = number;
    }

    public void setColor() {
        this.color = color;
    }

    public void setMaxSpeed() {
        this.maxSpeed = maxSpeed;
    }

    public void setEngine() {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public String move() {
        return "Car is moving";
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(model, number, color, maxSpeed, engine.clone());
    }
}
