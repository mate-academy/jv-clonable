package core.basesyntax;

public class Car implements Cloneable {
    private int year;
    private String colour;
    private String model;
    private int speed;
    private Engine engine;

    public void setYear(int year) {
        this.year = year;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(int year, String colour, String model, int speed, Engine engine) {
        this.year = year;
        this.colour = colour;
        this.model = model;
        this.speed = speed;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(getYear(), getColour(), getModel(), getSpeed(), getEngine());
    }
}
