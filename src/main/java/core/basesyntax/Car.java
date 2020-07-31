package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private BodyType bodyType;
    private String brand;
    private String model;
    private int maxSpeed;

    public Car(Engine engine, BodyType bodyType, String brand,
               String model, int maxSpeed) {
        this.engine = engine;
        this.bodyType = bodyType;
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public Car clone() {
        return new Car(engine.clone(), bodyType, brand, model,maxSpeed);
    }
}
