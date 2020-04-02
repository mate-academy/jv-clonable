package core.basesyntax;

public class Engine implements Cloneable {
    private String fuel;
    private int numberOfEngine;
    private int numberOfCylinders;
    private int maxPower;
    private int maxTorque;

    public Engine(String fuel, int numberOfEngine, int numberOfCylinders,
                  int maxPower, int maxTorque) {
        this.fuel = fuel;
        this.numberOfEngine = numberOfEngine;
        this.numberOfCylinders = numberOfCylinders;
        this.maxPower = maxPower;
        this.maxTorque = maxTorque;
    }

    @Override
    protected Engine clone() {
        return new Engine(fuel, numberOfEngine, numberOfCylinders, maxPower, maxTorque);
    }

}
