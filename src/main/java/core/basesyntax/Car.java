package core.basesyntax;

public class Car implements Cloneable {
    private int wheels;
    private int doors;
    private boolean conditioner;
    private String color;
    private Engine engine;

    public Car(int wheels, int doors, boolean conditioner, String color, Engine engine) {
        this.wheels = wheels;
        this.doors = doors;
        this.conditioner = conditioner;
        this.color = color;
        this.engine = engine;
    }

    public Car clone() {
        return new Car(wheels, doors, conditioner, color, engine.clone());
    }
}
