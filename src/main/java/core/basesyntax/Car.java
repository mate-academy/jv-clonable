package core.basesyntax;

public class Car implements Cloneable {
    private String manufacturer;
    private String model;
    private String carClass;
    private boolean isAirbag;
    private Engine engine;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setAirbag(boolean airbag) {
        isAirbag = airbag;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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
