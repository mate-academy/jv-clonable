package core.basesyntax;

public class Car implements Cloneable {

    private Engine engine;
    private String model;
    private int dateOf;
    private int serial;
    private String type;

    public Car(Engine engine, String model, int dateOf, int serial, String type) {
        this.engine = engine;
        this.model = model;
        this.dateOf = dateOf;
        this.serial = serial;
        this.type = type;
    }

    @Override
    public Car clone() {
        return new Car(engine.clone(), model, dateOf, serial, type);
    }
}
