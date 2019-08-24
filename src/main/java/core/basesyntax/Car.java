package core.basesyntax;

public class Car implements Cloneable {

    private String model;
    private double mileage;
    private int speed;
    private String color;
    private Engine engine;

    public Car(String model, double mileage, int speed, String color, Engine engine) {
        this.model = model;
        this.mileage = mileage;
        this.speed = speed;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car newCar = (Car)super.clone();
        Engine engine = this.getEngine().clone();
        newCar.setEngine(engine);
        return newCar;
    }
}
