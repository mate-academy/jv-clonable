package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String model;
    private boolean hasAutomaticTransmission;
    private Engine engine;
    private int mileage;

    public Car(String color, String model, boolean hasAutomaticTransmission, Engine engine,
               int mileage) {
        this.color = color;
        this.model = model;
        this.hasAutomaticTransmission = hasAutomaticTransmission;
        this.engine = engine;
        this.mileage = mileage;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(color, model, hasAutomaticTransmission, engine.clone(), mileage);
    }
}
