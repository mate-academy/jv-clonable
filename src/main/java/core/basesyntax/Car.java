package core.basesyntax;

public class Car implements Cloneable {

    private String brand;
    private String model;
    private int price;
    private int weight;
    private String colour;
    private Engine engine = new Engine();

    public Car(String brand, String model, int price, int weight, String colour) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel(String model) {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
