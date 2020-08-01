package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private double maxPower;
    private double energyCapacity;
    private EngineType engineType;
    private double distanceToService;
    private boolean check;

    public Engine() {
        engineType = EngineType.GASOLIN;
        volume = 2.2;
        maxPower = 10;
        energyCapacity = 1000;
        distanceToService = 10000;
        check = false;
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
