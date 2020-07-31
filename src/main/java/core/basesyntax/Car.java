package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String name;
    private int maxSpeed;
    private int maxWeight;
    private Engine engine;

    public Car(String model, String name, int maxSpeed, int maxWeight, Engine engine) {
        this.model = model;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(model, name, maxSpeed, maxWeight, engine.clone());
    }
}
