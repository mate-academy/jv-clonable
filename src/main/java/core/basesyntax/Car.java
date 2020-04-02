package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String colour;
    private String type;
    private int maxSpeed;
    private int acceleration;
    private Engine engine;

    public Car(String name, String colour, String type,
               int maxSpeed, int fuelType, Engine engine) {
        this.name = name;
        this.colour = colour;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.engine = engine;
    }

    @Override

    public Car clone() {
        return new Car(name, colour, type, maxSpeed, acceleration, engine.clone());
    }
}
