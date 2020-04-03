package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private int maxSpeed;
    private int doors;
    private boolean isNew;

    public Car(Engine engine, String color, int maxSpeed, int doors, boolean isNew) {
        this.engine = engine;
        this.doors = doors;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isNew = isNew;
    }

    public Car clone() {
        return new Car(engine, color, maxSpeed, doors, isNew);
    }
}
