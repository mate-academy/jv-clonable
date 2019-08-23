package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String name;
    private int maxSpeed;
    private String color;
    private int seats;

    public Car(Engine engine, String name, int maxSpeed, String color, int seats) {
        this.engine = engine;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.seats = seats;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(this.engine.clone(), this.name, this.maxSpeed, this.color, this.seats);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
