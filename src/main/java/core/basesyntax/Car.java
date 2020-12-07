package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private double price;
    private String brand;
    private String madeIn;

    public Car(Engine engine, String color, double price, String brand, String madeIn) {
        this.engine = engine;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.madeIn = madeIn;
    }

    public String toString() {
        return "Engine: " + this.engine + ", Color: " + this.color + ", Price: " + this.price
                + ", Made in: " + this.madeIn + ", Brand: " + this.brand;
    }

    @Override
    public Car clone() {
        try {
            Car cloneCar = (Car) super.clone();
            cloneCar.setEngine(engine.clone());
            return cloneCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t create User clone", e);
        }
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
}
