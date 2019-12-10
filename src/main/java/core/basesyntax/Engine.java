package core.basesyntax;

public class Engine implements Cloneable {
    private int powerful;
    private int price;
    private int weight;
    private int numberOfCylinders;
    private String type;

    public Engine(int powerful, int price, int weight,
                  int numberOfCylinders, String type) {
        this.powerful = powerful;
        this.price = price;
        this.weight = weight;
        this.numberOfCylinders = numberOfCylinders;
        this.type = type;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(powerful, price, weight, numberOfCylinders, type);
    }
}
