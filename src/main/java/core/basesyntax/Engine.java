package core.basesyntax;

public class Engine implements Cloneable {
    private String fuel;
    private int horsepower;
    private int volume;
    private int cylinder;
    private int newtonMeter;

    public Engine(String fuel, int horsepower, int volume, int cylinder, int newtonMeter) {
        this.fuel = fuel;
        this.horsepower = horsepower;
        this.volume = volume;
        this.cylinder = cylinder;
        this.newtonMeter = newtonMeter;
    }

    public Engine clone() {
        return new Engine(fuel, horsepower, volume, cylinder, newtonMeter);
    }
}
