package core.basesyntax;

public final class Car implements Cloneable {
    private String name;
    private String color;
    private int maxSpeed;
    private String type;
    private String year;
    private Engine engine;

    public Car(String name, String color, int maxSpeed, String type, String year, Engine engine) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.year = year;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(name,color, maxSpeed,type, year, engine.clone());
    }
}
