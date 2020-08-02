package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private int age;
    private int mileage;
    private int weight;

    public Car(Engine engine, String color, int age, int mileage, int weight) {
        this.engine = engine;
        this.color = color;
        this.age = age;
        this.mileage = mileage;
        this.weight = weight;
    }

    public Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), color, age, mileage, weight);
    }
}
