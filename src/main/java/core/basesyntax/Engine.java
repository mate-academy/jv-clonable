package core.basesyntax;

public class Engine implements Cloneable {
    private int price;
    private int capacity;
    private int power;
    private String fuelGrade;
    private String supplySystem;

    public Engine(int price, int capacity, int power, String fuelGrade, String supplySystem) {
        this.price = price;
        this.capacity = capacity;
        this.power = power;
        this.fuelGrade = fuelGrade;
        this.supplySystem = supplySystem;
    }

    @Override
    public Object clone() {
        return new Engine(price, capacity, power, fuelGrade, supplySystem);
    }
}
