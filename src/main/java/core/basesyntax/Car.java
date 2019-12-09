package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private int speed;
    private Engine engine;
    private int age;
    private String color;

    public Car(String name, int speed, Engine engine, int age, String color) {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(name, speed, engine.clone(), age, color);
    }
}
