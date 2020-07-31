package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private int numberOfDoors;
    private Colour colour;
    private Engine engine;

    public Car(String brand, String model, int numberOfDoors, Colour colour, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.colour = colour;
        this.engine = engine;
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

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(brand,model,numberOfDoors,colour,engine.clone());
    }
}
