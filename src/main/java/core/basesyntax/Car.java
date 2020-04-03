package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String color;
    private String bodyType;
    private int maxSpeed;
    private Engine engine;

    public Car(String brand, String color, String bodyType, int maxSpeed, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.bodyType = bodyType;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(brand, color, bodyType, maxSpeed, engine.clone());
    }
}
