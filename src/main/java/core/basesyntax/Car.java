package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private String manufacturer;
    private int price;
    private int year;
    private boolean inStock;

    public Car(Engine engine, String color, String manufacturer,
               int price, int year, boolean inStock) {
        this.engine = engine;
        this.color = color;
        this.manufacturer = manufacturer;
        this.price = price;
        this.year = year;
        this.inStock = inStock;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "{color: " + color
                + " ,manufacturer: " + manufacturer
                + " ,price: " + price
                + " ,year: " + year
                + " ,in Stock: " + inStock
                + " ,engine power: " + getEngine().getPower() + "}";
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cant clone the Car", e);
        }
    }
}
