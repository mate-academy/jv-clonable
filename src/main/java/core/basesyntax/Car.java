package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private String color;
    private int age;
    private int weight;
    private int price;

    public Car(Engine engine, String model, String color, int age, int weight, int price) {
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car1 = new Car(engine, model, color, age, weight, price);
        return car1;
    }
}

