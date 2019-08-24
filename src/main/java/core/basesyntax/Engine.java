package core.basesyntax;

public class Engine implements Cloneable {

    private final int capacity;
    private final int power;
    private final int torque;
    private final int fuelConsumption;
    private final String fuelType;

    public int getCapacity() {
        return capacity;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getFuelType() {
        return fuelType;
    }

    public Engine(int capacity, int power, int torque, int fuelConsumption, String fuelType) {
        this.capacity = capacity;
        this.power = power;
        this.torque = torque;
        this.fuelConsumption = fuelConsumption;
        this.fuelType = fuelType;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
