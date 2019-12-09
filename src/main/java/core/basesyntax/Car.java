package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String type;
    private String color;
    private int maxSpeed;
    private int numOfSeats;
    private Engine engine;

    public Car(String name, String type, String color, int maxSpeed,
               int numOfSeats, Engine engine) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numOfSeats = numOfSeats;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(name, type, color, maxSpeed, numOfSeats, engine);
    }
}
