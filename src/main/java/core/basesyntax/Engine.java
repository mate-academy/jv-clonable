package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String version;
    private String producer;
    private String fuel;
    private double volume;

    public Engine(String type, String version, String producer, String fuel, double volume) {
        this.type = type;
        this.version = version;
        this.producer = producer;
        this.fuel = fuel;
        this.volume = volume;
    }

    @Override
    protected Engine clone() CloneNotSupportedException {
        return new Engine(type, version, producer, fuel, volume);
    }
}
