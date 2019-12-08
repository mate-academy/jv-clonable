package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private String model;
    private int maxSpeed;
    private int cost;

    public Car(Engine engine, String color, String model, int maxSpeed, int cost) {
        this.engine = engine;
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.cost = cost;
    }

    @Override
    public Car clone() {
        return new Car(engine.clone(), color, model, maxSpeed, cost);
    }

}
