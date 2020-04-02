package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private long serial;
    private String fuel;
    private int volume;
    private int torque;

    public Engine(String model, long serial, String fuel, int volume, int torque) {
        this.model = model;
        this.serial = serial;
        this.fuel = fuel;
        this.volume = volume;
        this.torque = torque;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Engine(model, serial, fuel, volume, torque);
    }
}
