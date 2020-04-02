package core.basesyntax;

public class Engine implements Cloneable {
    private String fuelType;
    private double fuelConsumption;
    private int maxPower;
    private int maxRpm;
    private int numeralOfCylinder;

    public Engine(String fuelType, double fuelConsumption, int maxPower,
                  int maxRpm, int numeralOfCylinder) {
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
        this.numeralOfCylinder = numeralOfCylinder;
    }

    public Engine clone() throws CloneNotSupportedException {
        return new Engine(fuelType, fuelConsumption, maxPower,
                maxRpm, numeralOfCylinder);
    }
}
