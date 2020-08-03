package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private String color;
    private int age;
    private int weight;
    private int price;

    public Car(Engine engine, String model, String color, int age, int weight, int price) {
        this.engine = engine;
        this.model = model;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.price = price;

    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), model, color, age, weight, price);
    }
}

