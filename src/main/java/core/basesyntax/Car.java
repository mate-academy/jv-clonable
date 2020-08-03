package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int price;
    private int speed; // km/hours
    private Engine engine;

    public Car(String model,String color,
               int speed, int price, Engine engine) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(model, color, price, speed, engine.clone());
    }
}
