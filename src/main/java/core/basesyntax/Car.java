package core.basesyntax;

public class Car implements Cloneable {

    private final String name;
    private final String model;
    private final int weight;
    private final int maxSpeed;
    private final int price;
    private Engine engine;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public Car(String name, String model, int weight, int maxSpeed, int price, Engine engine) {
        this.name = name;
        this.model = model;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.engine = engine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
