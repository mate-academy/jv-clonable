package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private int seats;
    private int doors;
    private String model;
    private Engine engine;

    public Car(String color, int seats, int doors,
               String model, Engine engine) {
        this.color = color;
        this.seats = seats;
        this.doors = doors;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(color, seats, doors, model, engine.clone());
    }
}
