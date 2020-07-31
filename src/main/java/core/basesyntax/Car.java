package core.basesyntax;

public class Car implements Cloneable {
    private final String name;
    private final String price;
    private final String color;
    private final int maxSpeed;
    private final Engine engine;

    public Car(String name, String price, String color, int maxSpeed, Engine engine) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public Object clone() {
        return new Car(name, price, color, maxSpeed, (Engine) engine.clone());
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
