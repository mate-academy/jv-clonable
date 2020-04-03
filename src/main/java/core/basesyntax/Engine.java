package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private String fuel;
    private Boolean hybrid;
    private int size;
    private int maxDistance;

    public Engine(double volume, String fuel, Boolean hybrid, int size, int maxDistance) {
        this.volume = volume;
        this.fuel = fuel;
        this.hybrid = hybrid;
        this.size = size;
        this.maxDistance = maxDistance;
    }

    @Override
    public Engine clone() {
        return new Engine(volume, fuel, hybrid, size, maxDistance);
    }
}
