package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private boolean isNew;
    private int topSpeed;
    private Engine engine;

    public Car(String name, String color, boolean isNew, int topSpeed, Engine engine) {
        this.name = name;
        this.color = color;
        this.isNew = isNew;
        this.topSpeed = topSpeed;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(name, color, isNew, topSpeed, engine.clone());
    }
}
