package core.basesyntax;

public class Car {

    private Engine engine;
    private int capacity;
    private int weight;
    private String name;
    private String model;

    public Car(Engine engine, int capacity, int weight, String name, String model) {
        this.engine = engine;
        this.capacity = capacity;
        this.weight = weight;
        this.name = name;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
