package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private String model;
    private int yearOfIssue;
    private int numberOfDoors;

    public Car(Engine engine, String color, String model, int yearOfIssue, int numberOfDoors) {
        this.engine = engine;
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.numberOfDoors = numberOfDoors;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{"
                + "engine=" + engine
                + ", color='" + color + '\''
                + ", model='" + model + '\''
                + ", yearOfIssue=" + yearOfIssue
                + ", numberOfDoors=" + numberOfDoors
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("We can't clone the car", e);
        }
    }
}
