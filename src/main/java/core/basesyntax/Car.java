package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private String maker;
    private int capacity;
    private int maxSpeed;

    public Car(Engine engine, String color, String maker, int capacity, int maxSpeed) {
        this.engine = engine;
        this.color = color;
        this.maker = maker;
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
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
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Car object", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "engine=" + getEngine()
                + ", color='" + color + '\''
                + ", maker='" + maker + '\''
                + ", capacity=" + capacity
                + ", maxSpeed=" + maxSpeed
                + '}';
    }

}
