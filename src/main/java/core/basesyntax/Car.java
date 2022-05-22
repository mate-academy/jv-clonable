package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private Engine engine;
    private String color;
    private int year;
    private int price;

    public Car(String name, Engine engine, String color, int year, int price) {
        this.name = name;
        this.engine = engine;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return (color + " " + name + " with " + engine.toString()
            + "\n" + "Made in " + year + ". Price - $" + price);
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone this car", e);
        }
    }
}
