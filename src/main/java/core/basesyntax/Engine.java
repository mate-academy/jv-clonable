package core.basesyntax;

public class Engine implements Cloneable {
    private String manufacturer;
    private String supply;
    private int power;
    private char type;
    private boolean condition;

    @Override
    public Engine clone() {
        Engine engine = new Engine();
        engine.manufacturer = manufacturer;
        engine.supply = supply;
        engine.power = power;
        engine.type = type;
        engine.condition = condition;
        return engine;
    }
}
