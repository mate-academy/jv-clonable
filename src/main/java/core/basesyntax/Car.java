package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String name;
    private int maxSpeed;
    private int price;
    private Engine engine;

    public Car(String color, String name, int maxSpeed, int price, Engine engine) {
        this.color = color;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(color, name, maxSpeed, price, engine.clone());
    }
}
