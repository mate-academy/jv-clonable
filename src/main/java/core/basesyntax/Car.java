package core.basesyntax;

public class Car implements Cloneable {
    private int year;
    private int power;
    private String color;
    private String brand;
    private Engine engine;

    Car(int year, int power, String color, String brand, Engine engine) {
        this.year = year;
        this.power = power;
        this.color = color;
        this.brand = brand;
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "year : " + year
                + "power : " + power
                + "color : " + color
                + "brand : " + brand
                + "engine : " + engine
                + "}";
    }

    @Override
    protected Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone the car", e);
        }
    }
}
