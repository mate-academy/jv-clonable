package core.basesyntax;

public class Car implements Cloneable {

    private String brand;
    private String model;
    private String color;
    private long vin;
    private Engine engine;

    public Car(String brand, String model, String color, long vin, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(brand, model, color, vin, engine);
    }
}
