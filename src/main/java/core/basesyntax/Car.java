package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String version;
    private int numberOfDoors;
    private Engine engine;

    public Car(String brand, String version, int numberOfDoors, Engine engine) {
        this.brand = brand;
        this.version = version;
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        clone().brand = brand;
        clone().model = model;
        clone().engine = engine;
        clone().numberOfDoors = numberOfDoors;
        clone().version = version;
        return clone();
    }
}
