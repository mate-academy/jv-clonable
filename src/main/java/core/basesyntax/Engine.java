package core.basesyntax;

public class Engine implements Cloneable {
    private double engineVolume;
    private int enginePower;
    private int numberOfCylinders;
    private String fuelType;
    private String cooling;

    public Engine(double engineVolume, int enginePower,
                  int numberOfCylinders, String fuelType, String cooling) {
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.numberOfCylinders = numberOfCylinders;
        this.fuelType = fuelType;
        this.cooling = cooling;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public Engine clone() throws CloneNotSupportedException {
        Engine newEngine = new Engine(this.engineVolume, this.enginePower, this.numberOfCylinders,
                this.fuelType, this.cooling);
        return newEngine;
    }
}
