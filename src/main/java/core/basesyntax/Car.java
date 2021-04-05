package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int year;
    private int maxSpeed;
    private Engine engine;

    public Car(String model, String color, int year, int maxSpeed, Engine engine) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", maxSpeed=" + maxSpeed
                + ", engine=" + engine + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone car", e);
        }
    }
}
