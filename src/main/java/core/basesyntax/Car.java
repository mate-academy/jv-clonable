package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String name;
    private String model;
    private String color;
    private double weight;
    private int amountDoor;

    public Car(Engine engine, String name, String model, String color, double weight,int door) {
        this.engine = engine;
        this.name = name;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.amountDoor = door;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(engine, name, model, color, weight, amountDoor);
    }
}
