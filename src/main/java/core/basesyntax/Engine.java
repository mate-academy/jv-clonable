package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private EngineType engineType;
    private int cylindersCount;
    private boolean isTurbocharged;
    private String fuelType;

    public Engine(double volume, EngineType engineType, int cylindersCount,
                  boolean isTurbocharged, String fuelType) {
        this.volume = volume;
        this.engineType = engineType;
        this.cylindersCount = cylindersCount;
        this.isTurbocharged = isTurbocharged;
        this.fuelType = fuelType;
    }

    @Override
    public Engine clone() {
        return new Engine(volume, engineType,cylindersCount, isTurbocharged, fuelType);
    }
}
