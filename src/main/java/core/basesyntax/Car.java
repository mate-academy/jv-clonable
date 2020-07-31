package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String version;
    private int numberOfDoors;
    private Engine engine;

    public Car(String brand, String model, String version, int numberOfDoors, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.version = version;
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        brand = brand;
        model = model;
        version = version;
        numberOfDoors = numberOfDoors;
        engine = engine;
        return new Car(brand, model, version, numberOfDoors, engine);
    }
}
