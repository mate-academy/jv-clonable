package core.basesyntax;

public class Car implements Cloneable {

    private Engine engine;
    private String name;
    private String color;
    private int price;
    private int year;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{"
               + "engine=" + engine
               + ", name='" + name + '\''
               + ", color='" + color + '\''
               + ", price=" + price
               + ", year=" + year
               + '}';
    }

    @Override
    protected Car clone() {
        try {
            Car cloneCar = (Car) super.clone();
            cloneCar.setEngine(engine.clone());
            return cloneCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone: " + e);
        }
    }
}
