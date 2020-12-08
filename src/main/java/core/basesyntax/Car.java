package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private int year;
    private int price;
    private Engine engine;

    public Car(String name, String color, int year, int price, Engine engine) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car: " + name + ", color: " + color + ", release year: " + year + ", price: "
                + price + ", engine: " + engine;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create car clone!", e);
        }
    }
}
