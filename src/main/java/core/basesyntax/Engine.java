package core.basesyntax;

public class Engine implements Cloneable {
    private int height;
    private int weight;
    private int length;
    private int power;
    private int cost;

    public Engine(int height, int weight, int length, int power, int cost) {
        this.cost = cost;
        this.power = power;
        this.length = length;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public Engine clone() {
        return new Engine(height, weight, length, power, cost);
    }
}
