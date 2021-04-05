package core.basesyntax;

public class Car implements Cloneable {
    private static final String DEFAULT_MODEL = "Vaz-28";
    private static final String DEFAULT_COLOR = "Blue";
    private static final double DEFAULT_WEIGHT = 7.8;
    private static final double DEFAULT_MAXIMUM_SPEED = 120;

    private String model;
    private String color;
    private double weight;
    private double maximumSpeed;
    private Engine engine;

    public Car() {
        this.model = DEFAULT_MODEL;
        this.color = DEFAULT_COLOR;
        this.weight = DEFAULT_WEIGHT;
        this.maximumSpeed = DEFAULT_MAXIMUM_SPEED;
        this.engine = new Engine();
    }

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model = " + model
                + ", color= " + color
                + ", weight = " + weight
                + ", maximumSpeed = " + maximumSpeed
                + ", engine = " + engine
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone the car", e);
        }
    }
}
