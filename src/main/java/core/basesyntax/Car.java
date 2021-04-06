package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int year;
    private Engine engine;
    private int maxSpeed;
    private String manufacturer;

    public Car(String model, int year, Engine engine, int maxSpeed, String manufacturer) {
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + " model='" + model + '\''
                + ", year=" + year
                + ", engine=" + engine
                + ", maxSpeed=" + maxSpeed
                + ", manufacturer='" + manufacturer + '\''
                + '}';
    }
}
