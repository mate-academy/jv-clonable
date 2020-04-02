package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String type;
    private String fuel;
    private int rpm;
    private int horsePower;

    public Engine() {

    }

    public Engine(String name, String type, String fuel, int rpm, int horsePower) {
        this.name = name;
        this.type = type;
        this.fuel = fuel;
        this.rpm = rpm;
        this.horsePower = horsePower;
    }

    @Override
    protected Engine clone() {
        return new Engine(name, type, fuel, rpm, horsePower);
    }
}
