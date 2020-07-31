package core.basesyntax;

public class Engine implements Cloneable {
    private int volume;
    private int numberOfCylinders;
    private int fuelConsumption;
    private int horsePower;
    private int weight;

    Engine(int volume, int numberOfCylinders, int fuelConsumption, int horsePower, int weight) {
        this.volume = volume;
        this.numberOfCylinders = numberOfCylinders;
        this.fuelConsumption = fuelConsumption;
        this.horsePower = horsePower;
        this.weight = weight;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(volume, numberOfCylinders, fuelConsumption, horsePower, weight);
    }
}
