package core.basesyntax;

public class Car implements Cloneable {

    private String model;
    private String color;
    private int weight;
    private int maxSpeed;
    private Engine engine;

    public Car(String model, String color, int weight, int maxSpeed, Engine engine) {
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(model, color, weight, maxSpeed, engine.clone());
    }
}
