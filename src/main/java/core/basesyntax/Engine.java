package core.basesyntax;

public final class Engine implements Cloneable {
    private float volume;
    private int cylindersCount;
    private String model;
    private String fuelType;
    private String type;

    public Engine(float volume, int cylindersCount, String model, String fuelType, String type) {
        this.volume = volume;
        this.cylindersCount = cylindersCount;
        this.model = model;
        this.fuelType = fuelType;
        this.type = type;
    }

    @Override
    public Engine clone() {
        return new Engine(volume, cylindersCount, model, fuelType, type);
    }
}
