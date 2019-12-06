package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String model;
    private int yearOfConstruction;
    private Engine engine;
    private int numOfDoors;
    private String owner;

    public Car(String color, String model, int yearOfConstruction,
               Engine engine, int numOfDoors, String owner) {
        this.color = color;
        this.model = model;
        this.yearOfConstruction = yearOfConstruction;
        this.engine = engine;
        this.numOfDoors = numOfDoors;
        this.owner = owner;
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

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car cloned = (Car) super.clone();
        cloned.setEngine((Engine) cloned.getEngine().clone());
        return cloned;
    }
}
