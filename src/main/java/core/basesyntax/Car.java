package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private int year;
    private int maximumSpeed;
    private Engine engine;

    public Car(String name, String color, int year, int maximumSpeed, Engine engine) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\''
                + ", color='" + color + '\''
                + ", year=" + year
                + ", maximumSpeed=" + maximumSpeed
                + ", numberOfSeats=" + engine + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngine(engine.clone());
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }
}
