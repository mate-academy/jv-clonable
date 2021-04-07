package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private Engine engine;
    private int maxSpeed;
    private String brand;
    private int year;

    public Car(String model, Engine engine, int maxSpeed, String brand, int year) {
        this.model = model;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", engine=" + engine
                + ", maxSpeed=" + maxSpeed
                + ", brand='" + brand + '\''
                + ", year=" + year
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngine(engine.clone());
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Car cannot be cloned ", e);
        }
    }
}
