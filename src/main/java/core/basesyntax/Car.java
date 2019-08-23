package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private double price;
    private double weight;
    private Engine engine;

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        clonedCar.setEngine(this.engine.clone());
        return clonedCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
