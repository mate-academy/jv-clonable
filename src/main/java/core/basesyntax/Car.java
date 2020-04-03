package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private int speed;
    private int price;
    private int weight;
    private Engine engine;

    public Car(String name, String color, int speed, int price, int weight, Engine engine) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.price = price;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    protected Car clone() {
        return new Car(name, color, speed, price, weight, engine.clone());
    }

}
