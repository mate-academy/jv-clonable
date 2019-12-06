package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String color;
    private int power;
    private int maxSpeed;
    private Engine engine;

    public Car(String brand, String model, String color, int power, int maxSpeed, Engine engine) {
        this.model = model;
        this.color = color;
        this.power = power;
        this.maxSpeed = maxSpeed;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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

    public Engine setEngine(Engine engine) {
        this.engine = engine;
        return engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(brand, model, color, power, maxSpeed, engine.clone());
    }
}
