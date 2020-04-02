package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private String carBrand;
    private String fuelType;
    private String bodyType;

    public Car(Engine engine, String color, String carBrand, String fuelType,
               String bodyType) {
        this.engine = engine;
        this.color = color;
        this.carBrand = carBrand;
        this.fuelType = fuelType;
        this.bodyType = bodyType;
    }

    public Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), color, carBrand, fuelType, bodyType);
    }
}

