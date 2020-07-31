package core.basesyntax;

public class Car implements Cloneable {
    private String mark;
    private String color;
    private int speed;
    private int numberOfPassengers;
    private Engine engine;

    public Car(String mark, String color, int speed, int numberOfPassengers, Engine engine) {
        this.mark = mark;
        this.color = color;
        this.speed = speed;
        this.numberOfPassengers = numberOfPassengers;
        this.engine = engine;
    }

    @Override
    protected Car clone() {
        return new Car(mark, color, speed, numberOfPassengers, engine.clone());
    }
}
