package core.basesyntax;

public class Car implements Cloneable {
    private String producer;
    private int countOfDoors;
    private Engine engine;
    private String color;
    private String type;

    public Car(String producer, int countOfDoors, Engine engine, String color, String type) {
        this.producer = producer;
        this.countOfDoors = countOfDoors;
        this.engine = engine;
        this.color = color;
        this.type = type;
    }

    @Override
    protected Car clone() {
        return new Car(producer, countOfDoors, engine.clone(), color, type);
    }
}
