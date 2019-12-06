package core.basesyntax;

public class Car implements Cloneable {
    private int height;
    private int weight;
    private String color;
    private double maxSpeed;
    private Engine engine;

    public Car(int height, int weight, String color, double maxSpeed, Engine engine) {
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(height, weight, color, maxSpeed, engine);
    }
}
