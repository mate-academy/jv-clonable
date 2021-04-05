package core.basesyntax;

public class Car implements Cloneable {
    private String manufacturer;
    private String model;
    private String carClass;
    private boolean isAirbag;
    private Engine engine;

    public Car(String manufacturer, String model,
               String carClass, boolean isAirbag, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.carClass = carClass;
        this.isAirbag = isAirbag;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.engine = engine.clone();
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Car", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "manufacturer='" + manufacturer + '\''
                + ", model='" + model + '\''
                + ", carClass='" + carClass + '\''
                + ", isAirbag=" + isAirbag
                + ", engine=" + engine
                + '}';
    }
}
