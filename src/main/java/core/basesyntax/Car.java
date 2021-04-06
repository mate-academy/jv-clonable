package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String name;
    private int year;
    private double cost;
    private Engine engine;

    public Car(String color, String name, int year, double cost, Engine engine) {
        this.color = color;
        this.name = name;
        this.year = year;
        this.cost = cost;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Color: " + color + ", name: " + name
                + ", year: " + year + ", cost: "
                + cost + ", engine: " + engine;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone this car object", e);
        }
    }



}
