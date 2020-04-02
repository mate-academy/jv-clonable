package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int numOfSits;
    private Engine engine;
    private String type;
    private int numOfWheels;

    public Car(String model, int numOfSits, Engine engine, String type, int numOfWheels) {
        this.model = model;
        this.numOfSits = numOfSits;
        this.engine = engine;
        this.type = type;
        this.numOfWheels = numOfWheels;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(model, numOfSits, engine.clone(), type, numOfWheels);
    }
}
