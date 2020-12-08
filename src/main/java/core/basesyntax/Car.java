package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int countDoors;
    private int countWheels;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone car", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", countDoors=" + countDoors
                + ", countWheels=" + countWheels
                + ", engine=" + engine
                + '}';
    }
}
