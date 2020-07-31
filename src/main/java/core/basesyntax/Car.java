package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private int maxSpeed;
    private String model;
    private String color;
    private int doorsAmount;

    public Car(int maxSpeed, String model, String color, int doorsAmount, Engine engine) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.doorsAmount = doorsAmount;
        this.engine = engine;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(maxSpeed, model, color, doorsAmount, engine.clone());
    }
}

