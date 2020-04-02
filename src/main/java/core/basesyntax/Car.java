package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String name;
    private int price;
    private String color;
    private int age;

    public Car(Engine engine, String name, int price, String color, int age) {
        this.engine = engine;
        this.name = name;
        this.price = price;
        this.color = color;
        this.age = age;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), name, price, color, age);
    }
}
