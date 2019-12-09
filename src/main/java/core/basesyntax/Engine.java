package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private double power;
    private double price;
    private int weight;
    private boolean type;

    public Engine(String name, double power, double price, int weight, boolean type) {
        this.name = name;
        this.power = power;
        this.price = price;
        this.weight = weight;
        this.type = type;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(name, power, price, weight, type);
    }
}
