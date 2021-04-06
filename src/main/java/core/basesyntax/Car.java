package core.basesyntax;

public class Car implements Cloneable {
    private int year;
    private int length;
    private int width;
    private String brand;
    private String color;
    private Engine engine;

    Car(int length, int width, int year, String brand, String color, Engine engine) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.year = year;
        this.brand = brand;
        this.engine = engine;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String toString() {
        return "This car's brand is " + getBrand() + ", length is " + getLength()
                + ", width " + getWidth() + ". This car is of " + getYear() + " year, "
                + getColor() + " color. It has an engine. " + getEngine();
    }

    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone the car", e);
        }
    }
}
