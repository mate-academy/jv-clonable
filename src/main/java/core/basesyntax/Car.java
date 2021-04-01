package core.basesyntax;

public class Car implements Cloneable {
    private String manufacturer;
    private String model;
    private int yearModel;
    private double maxSpeed;
    private Engine engine;

    public Car(String manufacturer, String model, int yearModel, double maxSpeed, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearModel = yearModel;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Couldn't clone Car!", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "manufacturer='" + manufacturer + '\''
                + ", model='" + model + '\''
                + ", yearModel=" + yearModel
                + ", maxSpeed=" + maxSpeed
                + ", engine=" + engine
                + '}';
    }
}
