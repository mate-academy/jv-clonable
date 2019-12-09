package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String fuel;
    private double capacity;
    private double weight;
    private int power;

    public Engine(String name, String fuel, double capacity, double weight, int power) {
        this.name = name;
        this.fuel = fuel;
        this.capacity = capacity;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public Engine clone() {
        return new Engine(name, fuel, capacity, weight, power);
    }
}
