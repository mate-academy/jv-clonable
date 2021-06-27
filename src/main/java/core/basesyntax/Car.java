package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String manufacturer;
    private int yearOfProduction;
    private int maximumSpeed;
    private Engine engine;

    public Car(String model, String manufacturer, int yearOfProduction,
               int maximumSpeed, Engine engine) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.maximumSpeed = maximumSpeed;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", manufacturer='" + manufacturer + '\''
                + ", yearOfProduction=" + yearOfProduction
                + ", maximumSpeed=" + maximumSpeed
                + ", engine=" + engine + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create car clone", e);
        }
    }
}
