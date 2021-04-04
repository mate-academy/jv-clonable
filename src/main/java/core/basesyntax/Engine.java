package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String version;
    private int numberOfCylinders;
    private double volume;
    private double fuelConsumption;

    public Engine(String model, String version, int numberOfCylinders,
                  double volume, double fuelConsumption) {
        this.model = model;
        this.version = version;
        this.numberOfCylinders = numberOfCylinders;
        this.volume = volume;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + model + '\''
                + ", version='" + version + '\''
                + ", numberOfCylinders=" + numberOfCylinders
                + ", volume=" + volume
                + ", fuelConsumption=" + fuelConsumption
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }
}
