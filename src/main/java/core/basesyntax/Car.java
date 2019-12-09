package core.basesyntax;

public class Car implements Cloneable {

    private Engine engine;
    private String color;
    private String brand;
    private int price;
    private int maxSpeed;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(Engine engine, String color, String brand, int price, int maxSpeed) {
        this.engine = engine;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), color, brand, price, maxSpeed);
    }
}
