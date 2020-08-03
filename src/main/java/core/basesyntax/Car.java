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
        engine = engine.clone();
        return (Car) super.clone();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
