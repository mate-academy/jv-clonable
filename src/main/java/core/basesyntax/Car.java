package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int year;
    private double price;
    private Engine engine;

    public Car(String model, String color, int year, double price, Engine engine) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Model: " + this.model + ", color: " + this.color + ", year: "
                + this.year + ", price: " + this.price + " " + this.engine.toString();
    }
}
