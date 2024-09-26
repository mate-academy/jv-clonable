package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int speed;
    private double power;
    private Engine engine;

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Object Car can't be clone", e);
        }
    }

    @Override
    public String toString() {
        return "Color " + color
                + " Speed " + speed
                + " Engine " + engine;
    }
}
