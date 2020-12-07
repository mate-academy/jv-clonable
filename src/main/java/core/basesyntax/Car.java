package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int countDoors;
    private int countWheels;
    private Engine engine;

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected int getCountDoors() {
        return countDoors;
    }

    protected void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    protected int getCountWheels() {
        return countWheels;
    }

    protected void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    protected Engine getEngine() {
        return engine;
    }

    protected void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    protected Car clone() {
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
