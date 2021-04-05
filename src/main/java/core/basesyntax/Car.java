package core.basesyntax;

import java.math.BigDecimal;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String type;
    private String color;
    private int issueYear;
    private Engine engine;
    private BigDecimal price;

    public Car(String brand, String model, String type, String color,
               int issueYear, Engine engine, BigDecimal price) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.issueYear = issueYear;
        this.engine = engine;
        this.price = price;
    }

    public Car(Car originalCar) {
        this.brand = originalCar.getBrand();
        this.model = originalCar.getModel();
        this.type = originalCar.getType();
        this.color = originalCar.getColor();
        this.issueYear = originalCar.getIssueYear();
        this.engine = new Engine(originalCar.getEngine());
        this.price = originalCar.getPrice();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand
                + ", model=" + model
                + ", type=" + type
                + ", color=" + color
                + ", issueYear=" + issueYear
                + ", engine=" + engine
                + ", price=" + price + "]";
    }

    @Override
    protected Car clone() {
        return new Car(this);
    }
}
