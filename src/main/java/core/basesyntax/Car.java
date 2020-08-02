package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private int mph;
    private int capacity;
    private int range;

    public Car(Engine engine, String model, int mph, int capacity, int range) {
        this.engine = engine;
        this.model = model;
        this.mph = mph;
        this.capacity = capacity;
        this.range = range;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), model, mph, capacity, range);
    }
}
