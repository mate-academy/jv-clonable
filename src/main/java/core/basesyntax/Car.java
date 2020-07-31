package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private Engine engine;
    private int year;
    private double speed;

    public Car(String model, String color, Engine engine, int year, double speed) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.year = year;
        this.speed = speed;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    protected Car clone() throws CloneNotSupportedException {
        Car newCar = (Car)super.clone();
        newCar.setEngine((Engine) newCar.getEngine().clone());
        return newCar;
    }
}
