package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private int price;
    private Engine engine;
    private String color;

    public Car(String brand, String model, int price, Engine engine, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.engine = engine;
        this.color = color;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Engine cloneEngine = engine.clone();
        return new Car(brand, model, price, cloneEngine, color);
    }
}
