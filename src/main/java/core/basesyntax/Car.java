package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String configuration;
    private String serialNumber;
    private int maxSpeed;
    private Engine engine;

    public Car(String color, String configuration, String s, int maxSpeed, Engine engine) {
        this.color = color;
        this.configuration = configuration;
        serialNumber = s;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(color, configuration, serialNumber, maxSpeed, engine.clone());
    }
}
