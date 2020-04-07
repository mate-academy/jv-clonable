package core.basesyntax;

public class Engine implements Cloneable {
    private String fuel;
    private float capacity;
    private int power;
    private int year;
    private String code;

    public Engine(String fuel, float capacity, int power,
               int year, String code) {
        this.fuel = fuel;
        this.capacity = capacity;
        this.power = power;
        this.year = year;
        this.code = code;
    }

    @Override
    public Engine clone() {
        return new Engine(fuel, capacity, power, year, code);
    }
}
