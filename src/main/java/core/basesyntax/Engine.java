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
        Engine engine = new Engine();
        engine.volume = volume;
        engine.maxPower = maxPower;
        engine.energyCapacity = energyCapacity;
        engine.engineType = engineType;
        engine.distanceToService = distanceToService;
        engine.check = check;
        return engine;
    }

}
