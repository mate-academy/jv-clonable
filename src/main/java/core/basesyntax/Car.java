package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private int maxSpeed;
    private int doors;
    private boolean isNew;

    public Car(Engine engine, String color, int maxSpeed, int doors, boolean isNew) {
        this.isNew = isNew;
        this.doors = doors;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isNew = isNew;
    }

    public Car clone(Car other) throws CloneNotSupportedException {
        return new Car(other.engine, other.color, other.maxSpeed, other.doors, other.isNew);
    }
}
