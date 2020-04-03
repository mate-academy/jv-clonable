package core.basesyntax;

public class Engine implements Cloneable {
    private String engineType;
    private int engineVolume;
    private int weight;
    private int amountHP;
    private String fuelType;

    public Engine(String engineType, int engineVolume, int weight, int amountHP, String fuelType) {
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.weight = weight;
        this.amountHP = amountHP;
        this.fuelType = fuelType;
    }

    @Override
    public Engine clone() {
        return new Engine(engineType, engineVolume, weight, amountHP, fuelType);
    }
}
