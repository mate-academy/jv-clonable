package core.basesyntax;

public class Car implements Cloneable {
    private String manufacturer;
    private String model;
    private int maxSpeed;
    private int length;
    private String color;
    private Engine engine;

    public Car(String manufacturer,
               String model,
               int maxSpeed,
               int length,
               String color,
               Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.length = length;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(manufacturer, model, maxSpeed, length, color, engine.clone());
    }
}

