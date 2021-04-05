package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int speed;
    private int numberOfPassengers;
    private int numberOfDoors;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            Car cloneCar = (Car) super.clone();
            cloneCar.setEngine(engine.clone());
            return cloneCar;
        } catch (Exception e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", speed='" + speed + '\''
                + ", numberOfPassengers='" + numberOfPassengers + '\''
                + ", numberOfDoors='" + numberOfDoors + '\''
                + ", engine" + engine + '}';
    }
}
