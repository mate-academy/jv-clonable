package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String colour;
    private int maxSpeed;
    private int  peopleCapacity;
    private int yearBuild;
    private Engine engine;

    public Car(String model, Engine engine, String colour,
               int maxSpeed, int peopleCapacity, int yearBuild) {
        this.model = model;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.peopleCapacity = peopleCapacity;
        this.yearBuild = yearBuild;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public int getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(model, engine, colour, maxSpeed, peopleCapacity, yearBuild);
    }
}
