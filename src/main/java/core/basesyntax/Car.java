package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String name;
    private String color;
    private int year;
    private int maxSpeed;

    public Car() {

    }

    public Car(Engine engine, String name, String color, int year, int maxSpeed) {
        this.engine = engine;
        this.name = name;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected Car clone() {
        return new Car(engine.clone(), name, color, year, maxSpeed);
    }
}
