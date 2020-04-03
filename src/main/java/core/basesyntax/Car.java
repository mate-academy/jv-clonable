package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private Engine engine;
    private String driveUnit;
    private int numberOfSeats;

    public Car(String model, String color, Engine engine, String driveUnit, int numberOfSeats) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.driveUnit = driveUnit;
        this.numberOfSeats = numberOfSeats;
    }

    public Car clone() {
        return new Car(model, color, engine, driveUnit, numberOfSeats);
    }

}
