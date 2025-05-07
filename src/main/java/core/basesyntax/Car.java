package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private int height;
    private double length;
    private boolean isAvailable;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("ERROR: error occurred in 'Car' class - clone() method", e);
        }
    }

    @Override
    public String toString() {
        return "Car{" + " engine = " + engine + ", carModel=" + model
                + ", height=" + height + ", length=" + length
                + ", isAvailable=" + isAvailable + "}";
    }
}
