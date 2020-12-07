package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private Engine engine;
    private int establishYear;
    private String vehicleType;
    private int passengersCapacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getEstablishYear() {
        return establishYear;
    }

    public void setEstablishYear(int establishYear) {
        this.establishYear = establishYear;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngine(engine.clone());
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Car object", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", engine=" + engine
                + ", establishYear=" + establishYear
                + ", vehicleType='" + vehicleType + '\''
                + ", passengersCapacity=" + passengersCapacity
                + '}';
    }
}
