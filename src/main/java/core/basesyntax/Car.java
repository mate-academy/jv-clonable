package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String price;
    private String color;
    private int maxSpeed;
    private Engine engine;

    public Car(String name, String price, String color, int maxSpeed, Engine engine) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(name, price, color, maxSpeed, engine.clone());
    }

    @Override
    public String toString() {
        return "Car{"
                + "name='" + name + '\''
                + ", price='" + price + '\''
                + ", color='" + color + '\''
                + ", maxSpeed=" + maxSpeed
                + ", engine=" + engine
                + '}';
    }
}
