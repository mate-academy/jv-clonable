package core.basesyntax;

public class Engine implements Cloneable {

    private double engineCapacity;
    private double noiseLevel;
    private int serialNumber;
    private double weight;
    private int torque;

    public Engine(double engineCapacity, double noiseLevel,
                  int serialNumber, double weight, int torque) {
        this.engineCapacity = engineCapacity;
        this.noiseLevel = noiseLevel;
        this.serialNumber = serialNumber;
        this.weight = weight;
        this.torque = torque;
    }

    @Override
    protected Engine clone() {
        return new Engine(engineCapacity, noiseLevel, serialNumber, weight, torque);
    }
}
