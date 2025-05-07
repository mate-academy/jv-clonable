package core.basesyntax;

public class Car implements Cloneable {

    private String model;
    private String color;
    private int yearOfConstruction;
    private int speed;
    private int seats;
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String toString() {
        return "Car";
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }
}


