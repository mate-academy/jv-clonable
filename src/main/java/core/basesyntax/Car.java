package core.basesyntax;

import core.basesyntax.types.CarBodyStyles;
import core.basesyntax.types.CarBrand;

public class Car implements Cloneable {
    private Engine engine;
    private CarBodyStyles bodyStyle;
    private CarBrand brand;
    private int yearCreate;
    private String color;

    public Car(Engine engine, CarBodyStyles bodyStyle, CarBrand brand, int yearCreate, String color) {
        this.engine = engine;
        this.bodyStyle = bodyStyle;
        this.brand = brand;
        this.yearCreate = yearCreate;
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarBodyStyles getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(CarBodyStyles bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public int getYearCreate() {
        return yearCreate;
    }

    public void setYearCreate(int yearCreate) {
        this.yearCreate = yearCreate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Car: %s, body: %s, was create: %d year, color: %s, %s"
                , brand, bodyStyle, yearCreate, color, engine);

    }

    @Override
    public Car clone() {
        Car clone;
        try {
            clone = (Car) super.clone();
            clone.setBodyStyle(this.getBodyStyle());
            clone.setBrand(this.brand);
            clone.setEngine(engine.clone());
            clone.setColor(this.getColor());
            clone.setYearCreate(this.yearCreate);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Car cannot be clone.", e);
        }
        return clone;
    }
}
