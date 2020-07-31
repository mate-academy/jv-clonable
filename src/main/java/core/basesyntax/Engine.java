package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private double capacity;
    private String powerType;
    private int numberOfCylinders;
    private int fuelConsumption;

    public Engine(int power, double capacity, String powerType, int numberOfCylinders,
                  int fuelConsumption) {
        this.power = power;
        this.capacity = capacity;
        this.powerType = powerType;
        this.numberOfCylinders = numberOfCylinders;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(power, capacity, powerType, numberOfCylinders, fuelConsumption);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
