package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private Engine engine;
    private int maxSpeed;
    private int weight;

    public Car(String model, String color, Engine engine, int maxSpeed, int weight) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    protected Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Model:" + model + "\n"
                + "Color:" + color + "\n"
                + "Engine:" + engine.getModel() + "\n"
                + "MaxSpeed:" + maxSpeed + "\n"
                + "Weight:" + weight + "\n";
    }
}
