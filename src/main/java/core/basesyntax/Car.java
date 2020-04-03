package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private int maxSpeed;
    private int capacity;
    private Engine engine;

    public Car(String name, String color, int maxSpeed, int capacity, Engine engine) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name
                + '\''
                + ", color='" + color
                + '\''
                + ", maxSpeed=" + maxSpeed
                + ", capacity=" + capacity
                + ", engine=" + engine
                + '}';
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(name, color, maxSpeed, capacity, engine);
    }
}
