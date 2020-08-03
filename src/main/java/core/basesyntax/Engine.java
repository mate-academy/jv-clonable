package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private double maxPower;
    private double energyCapacity;
    private EngineType engineType;
    private double distanceToService;
    private boolean check;

    public Engine(double volume, double maxPower, double energyCapacity,
                  double distanceToService, boolean check, EngineType engineType) {
        this.volume = volume;
        this.maxPower = maxPower;
        this.energyCapacity = energyCapacity;
        this.distanceToService = distanceToService;
        this.check = check;
        this.engineType = engineType;
    }

    public Engine clone() {
        return new Engine(volume, maxPower, energyCapacity, distanceToService, check, engineType);
    }

}
