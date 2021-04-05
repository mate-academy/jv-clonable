package core.basesyntax;

public class Engine implements Cloneable {
    private int engineCapacity;
    private int maximumPower;
    private String usedFuel;
    private double fuelConsumption;
    private int numberOfValves;

    public Engine(int engineCapacity, int maximumPower, String usedFuel,
                  double fuelConsumption, int numberOfValves) {
        this.engineCapacity = engineCapacity;
        this.maximumPower = maximumPower;
        this.usedFuel = usedFuel;
        this.fuelConsumption = fuelConsumption;
        this.numberOfValves = numberOfValves;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getMaximumPower() {
        return maximumPower;
    }

    public void setMaximumPower(int maximumPower) {
        this.maximumPower = maximumPower;
    }

    public String getUsedFuel() {
        return usedFuel;
    }

    public void setUsedFuel(String usedFuel) {
        this.usedFuel = usedFuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "engineCapacity = " + engineCapacity
                + ", maximumPower = " + maximumPower
                + ", usedFuel = " + usedFuel
                + ", fuelConsumption = " + fuelConsumption
                + ", numberOfValves = " + numberOfValves
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone Engine", e);
        }

    }
}
