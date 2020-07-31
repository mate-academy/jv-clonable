package core.basesyntax;

public class Engine implements Cloneable {
    private int maxSpeed;
    private double engineCapacity;
    private int fuelConsumption;
    private int torque;
    private String type;

    public Engine(int maxSpeed, double engineCapacity,
                  int fuelConsumption, int torque, String type) {
        this.maxSpeed = maxSpeed;
        this.engineCapacity = engineCapacity;
        this.fuelConsumption = fuelConsumption;
        this.torque = torque;
        this.type = type;
    }

    @Override
    protected Engine clone() {
        return new Engine(maxSpeed, engineCapacity, fuelConsumption, torque, type);
    }
}
