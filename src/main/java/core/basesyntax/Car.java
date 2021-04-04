package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int speed;
    private int numberOfPassengers;
    private int numberOfDoors;
    private Engine engine;

    public Car(String model, String color, int speed, int numberOfPassengers, int numberOfDoors) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.numberOfPassengers = numberOfPassengers;
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
