package core.basesyntax;

import core.basesyntax.types.CarBodyStyle;
import core.basesyntax.types.CarBrand;

public class Car implements Cloneable {
    private Engine engine;
    private CarBodyStyle bodyStyle;
    private CarBrand brand;
    private int yearCreate;
    private String color;

    public Car(Engine engine, CarBodyStyle bodyStyle, CarBrand brand,
               int yearCreate, String color) {
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

    public CarBodyStyle getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(CarBodyStyle bodyStyle) {
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
        return String.format("Car: %s, body: %s, was create: %d year, color: %s, %s",
                brand, bodyStyle, yearCreate, color, engine);

    }

    @Override
    public Car clone() {
        try {
            Car clone = (Car) super.clone();
            clone.setEngine(engine.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone the car", e);
        }
    }
}
