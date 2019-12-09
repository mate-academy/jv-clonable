package core.basesyntax;

public class Engine implements Cloneable {
    private int volume;
    private String fuel;
    private int maxSpeed;
    private int numOfCylinders;
    private int fuelConsumption;

    public Engine(int volume, String fuel,
                  int maxSpeed, int numberOfCylinders, int fuelConsumption) {
        this.volume = volume;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
        this.numOfCylinders = numberOfCylinders;
        this.fuelConsumption = fuelConsumption;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumOfCylinders() {
        return numOfCylinders;
    }

    public void setNumOfCylinders(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(volume, fuel, maxSpeed, numOfCylinders, fuelConsumption);
    }
}

