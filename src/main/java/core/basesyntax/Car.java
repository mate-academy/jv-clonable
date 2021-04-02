package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String manufacturer;
    private String model;
    private String type;
    private int passengersAmount;

    public Car(Engine engine, String manufacturer, String model, String type,
               int passengersAmount) {
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.passengersAmount = passengersAmount;
    }

    @Override
    public String toString() {
        return "Car{" + "engine=" + engine
                + ", manufacturer='" + manufacturer + '\''
                + ", model='" + model + '\''
                + ", type='" + type + '\''
                + ", passengersAmount=" + passengersAmount + '}';
    }

    @Override
    public Car clone() {
        Car car;
        try {
            car = (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            car = new Car(this.engine, this.manufacturer, this.model, this.type,
                    this.passengersAmount);
        }
        car.engine = (Engine) this.engine.clone();
        return car;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }
}
