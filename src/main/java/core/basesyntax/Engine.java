package core.basesyntax;

public class Engine implements Cloneable {
    private String engineName;
    private String type;
    private String fuel;
    private int year;
    private int horsePower;

    public Engine(String engineName, String type, String fuel, int year, int horsePower) {
        this.engineName = engineName;
        this.type = type;
        this.fuel = fuel;
        this.year = year;
        this.horsePower = horsePower;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(engineName, type, fuel, year, horsePower);
    }
}
