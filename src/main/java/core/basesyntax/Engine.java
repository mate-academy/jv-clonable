package core.basesyntax;

public class Engine implements Cloneable {
    private int volume;
    private String model;
    private String fuelType;
    private int power;
    private int fuelConsumption;

    public Engine(int volume, String model, String fuelType, int power, int fuelConsumption) {
        this.volume = volume;
        this.model = model;
        this.fuelType = fuelType;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(volume, model, fuelType, power, fuelConsumption);
    }
}
