package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String number;
    private int maximumSpeed;
    private Engine engine;

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

    public String getNumber() {
        return number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{"
                + "brand = " + brand
                + ", model = " + model
                + ", number = " + number
                + ", maximum speed = " + maximumSpeed
                + ", engine" + engine.toString()
                + "}";

    }

    @Override
    public Car clone() {
        Car clonedCar = new Car();
        clonedCar.setNumber(this.number);
        clonedCar.setMaximumSpeed(this.maximumSpeed);
        clonedCar.setModel(this.model);
        clonedCar.setBrand(this.brand);
        clonedCar.setEngine(engine.clone());
        return clonedCar;
    }
}
