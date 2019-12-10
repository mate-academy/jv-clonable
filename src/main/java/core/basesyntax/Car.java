package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int maxSpeed;
    private int mileage;
    private Engine engine;

    public Car(String model, String color, int maxSpeed, int mileage, Engine engine) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car newCar = new Car(model, color, maxSpeed, mileage, engine.clone());
        return newCar;
    }
}
