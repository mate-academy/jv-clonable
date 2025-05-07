package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private String manufacturer;
    private String color;
    private int maxSpeed;

    public Car(String model, String manufacturer, String color, int maxSpeed) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    @Override
    public String toString() {
        return "Car{"
                + "engine=" + engine
                + ", model='" + model + '\''
                + ", manufacturer='" + manufacturer + '\''
                + ", color='" + color + '\''
                + ", maxSpeed=" + maxSpeed
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngine(engine.clone());
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone this Car", e);
        }
    }
}
