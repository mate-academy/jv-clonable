package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String vin;
    private int year;
    private String equipment;
    private String fuelType;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
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
            throw new RuntimeException("Cannot create car's clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car {"
                + "model = '" + model + '\''
                + ", year = " + year
                + ", vin = '" + vin + '\''
                + ", equipment = '" + equipment + '\''
                + ", fuelType = '" + fuelType + '\''
                + ", engine = " + engine + '}';
    }
}
