package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String colour;
    private String model;
    private int capacity;
    private int maxSpeed;

    public Car(Engine engine, String colour, String model, int capacity, int maxSpeed) {
        this.engine = engine;
        this.colour = colour;
        this.model = model;
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), colour, model, capacity, maxSpeed);
    }
}
