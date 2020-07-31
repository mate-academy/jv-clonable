package core.basesyntax;

public class Car implements Cloneable {
    private String colour;
    private String brand;
    private int speed;
    private int price;
    private Engine engine;

    @Override
    public Car clone() throws CloneNotSupportedException {
        this.engine = engine.clone();
        return (Car) super.clone();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
