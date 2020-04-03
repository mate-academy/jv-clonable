package core.basesyntax;

public class Engine implements Cloneable {

    private String type;
    private double capacity;
    private double weight;
    private String state;
    private int price;

    public Engine() {
    }

    public Engine(String type, String state, int price, double capacity, double weight) {
        this.type = type;
        this.state = state;
        this.price = price;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Engine(type, state, price, capacity, weight);
    }
}
