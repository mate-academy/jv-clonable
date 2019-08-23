package core.basesyntax;

public class Engine implements Cloneable {
    private String fuelType;
    private double volume;
    private double fuelCons;
    private int numberOfCyl;
    private int maxTorque;

    public Engine(String fuelType, double volume, double fuelCons, int numberOfCyl, int maxTorque) {
        this.fuelType = fuelType;
        this.volume = volume;
        this.fuelCons = fuelCons;
        this.numberOfCyl = numberOfCyl;
        this.maxTorque = maxTorque;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(this.fuelType, this.volume,
                this.fuelCons, this.numberOfCyl, this.maxTorque);
    }

}
