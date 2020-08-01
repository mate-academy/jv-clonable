package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String brand;
    private int price;
    private int weight;
    private Engine engine;

    public Car(String color, String brand, int price, int weight, Engine engine) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(color, brand, price, weight, engine.clone());
    }
}
