package core.basesyntax;

public class Car implements Cloneable {

    private String brand;
    private String model;
    private int price;
    private int weight;
    private String colour;
    private Engine engine;

    public Car(String brand, String model, int price, int weight, String colour, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.colour = colour;
        this.engine = engine;
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
    public Object clone() {
        return new Car(brand, model, price, weight, colour, (Engine)engine.clone());
    }
}

