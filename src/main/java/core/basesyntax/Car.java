package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String brand;
    private String color;
    private int maxSpeed;
    private boolean isAM;

    public Car(Engine engine, String brand, String color, int maxSpeed, boolean isAM) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isAM = isAM;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), brand, color, maxSpeed, isAM);
    }
}
