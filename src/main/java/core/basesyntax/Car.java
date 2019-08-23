package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String type;
    private String color;
    private int maxSpeed;
    private int numOfSeats;
    private Engine engine;

    public Car() {

    }

    public Car(String name, String type, String color,
               int maxSpeed, int numOfSeats, Engine engine) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numOfSeats = numOfSeats;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car clone = new Car();
        clone.setName(this.name);
        clone.setType(this.type);
        clone.setColor(this.color);
        clone.setMaxSpeed(this.maxSpeed);
        clone.setNumOfSeats(this.numOfSeats);
        clone.setEngine(this.engine.clone());
        return clone;
    }
}
