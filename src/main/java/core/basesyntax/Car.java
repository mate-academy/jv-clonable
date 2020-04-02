package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String type;
    private int capacity;
    private Engine engine;

    public Car(String brand, String model, String type, int capacity, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.capacity = capacity;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(brand, model, type, capacity, engine.clone());
    }
}
