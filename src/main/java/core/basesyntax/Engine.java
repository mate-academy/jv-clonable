package core.basesyntax;

public class Engine implements Cloneable {
    private static final int DEFAULT_ENGINE_CAPACITY = 1452;
    private static final int DEFAULT_MAXIMUM_POWER = 68;
    private static final String DEFAULT_USED_FUEL = "Gasoline";
    private static final double DEFAULT_FUEL_CONSUMPTION = 7.8;
    private static final int DEFAULT_NUMBER_OF_VALVES = 2;

    private int engineCapacity;
    private int maximumPower;
    private String usedFuel;
    private double fuelConsumption;
    private int numberOfValves;

    public Engine() {
        this.engineCapacity = DEFAULT_ENGINE_CAPACITY;
        this.maximumPower = DEFAULT_MAXIMUM_POWER;
        this.usedFuel = DEFAULT_USED_FUEL;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
        this.numberOfValves = DEFAULT_NUMBER_OF_VALVES;
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
