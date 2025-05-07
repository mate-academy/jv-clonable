package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private Engine engine;
    private int weight;
    private String color;
    private int numberOfPassenger;

    public Car() {
    }

    public Car(String model, Engine engine, int weight, String color, int numberOfPassenger) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
        this.numberOfPassenger = numberOfPassenger;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", engine=" + engine
                + ", weight=" + weight
                + ", color='" + color + '\''
                + ", numberOfPassenger=" + numberOfPassenger
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone class Car!", e);
        }
    }
}
