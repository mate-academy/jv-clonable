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
    protected Object clone() throws CloneNotSupportedException {
        return new Car(engine, model, dateOf, serial, type);
    }
}
