package core.basesyntax;

public class Car implements Cloneable {
    private String manufacturer;
    private String model;
    private String color;
    private int maxSpeed;
    private Engine engine;

    public Car(String manufacturer, String model, String color, int maxSpeed, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(manufacturer, model, color, maxSpeed, engine.clone());
    }
}
