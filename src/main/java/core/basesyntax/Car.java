package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private int maxSpeed;
    private boolean isEco;
    private String color;

    public Car(Engine engine, String model, int maxSpeed, boolean isEco, String color) {
        this.engine = engine;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.isEco = isEco;
        this.color = color;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(this.engine.clone(), this.model, this.maxSpeed, this.isEco, this.color);
    }
}
