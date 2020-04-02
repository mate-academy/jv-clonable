package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String color;
    private double value;
    private Engine engine;

    public Car(String brand, String model, String color, double value, Engine engine) {
        brand = brand;
        model = model;
        color = color;
        value = value;
        engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(brand, model, color, value, engine.clone());
    }
}
