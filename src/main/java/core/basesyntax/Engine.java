package core.basesyntax;

public class Engine implements Cloneable {

    private String model;
    private String driveUnit;
    private String transmission;
    private int volume;
    private int maxPower;

    public Engine build() {

        Engine engine = new Engine();
        engine.model = Engine.this.model;
        engine.driveUnit = Engine.this.driveUnit;
        engine.transmission = Engine.this.transmission;
        engine.volume = Engine.this.volume;
        engine.maxPower = Engine.this.maxPower;

        return engine;
    }

    @Override
    public Object clone() {
        Engine engine = new Engine();
        engine.build();
        return engine;
    }
}
