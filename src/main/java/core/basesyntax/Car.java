package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int year;
    private int maxSpeed;
    private String manufacturer;
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
    public String toString() {
        return "Car{" + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", maxSpeed=" + maxSpeed
                + ", manufacturer='" + manufacturer + '\''
                + ", engine=" + engine + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            clonedCar.setColor(color);
            clonedCar.setManufacturer(manufacturer);
            clonedCar.setMaxSpeed(maxSpeed);
            clonedCar.setYear(year);
            clonedCar.setModel(model);
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }
}
