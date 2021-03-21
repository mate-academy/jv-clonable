package core.basesyntax;

public class Car extends Engine implements Cloneable {
    private String color;
    private String model;
    private String owner;
    private int year;
    private Engine engine;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public Car clone() {
        Car clonedCar = (Car) super.clone();
        clonedCar.setEngine(engine.clone());
        return clonedCar;
    }

    @Override
    public String toString() {
        return "Car{"
                + "color='" + color + '\''
                + "model='" + model + '\''
                + "engine='" + engine + '\''
                + "owner='" + owner + '\''
                + "year='" + year + '\''
                + "}";
    }
}
