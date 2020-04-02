package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String type;
    private String color;
    private int maxSpeed;
    private Engine engine;

    public Car(String brand, String type, String color, int maxSpeed, Engine engine) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(brand, type, color, maxSpeed, engine.clone());
    }
}
