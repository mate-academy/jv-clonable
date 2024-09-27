package core.basesyntax;

public class Car implements Cloneable {

    private Engine engine;
    private final String model;
    private String color;
    private String owner;
    private int yearOfProduction;

    public Car(Engine engine, String model, String color, String owner, int yearOfProduction) {
        this.engine = engine;
        this.model = model;
        this.color = color;
        this.owner = owner;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(this.engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Could not clone car", e);
        }
    }

    public String toString() {
        return "Car: model = " + this.model
                + ", color = " + this.color
                + ", engine = " + this.engine.toString()
                + ", owner = " + this.owner
                + ", year = " + this.yearOfProduction;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public String getColor() {
        return this.model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return this.model;
    }

    public int getYearOfProduction() {
        return this.yearOfProduction;
    }
}
