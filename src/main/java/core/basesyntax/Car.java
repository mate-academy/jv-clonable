package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private String shape;
    private String model;
    private int year;

    public Car(Engine engine, String color, String model, int year) {
        this.engine = engine;
        this.color = color;
        this.shape = shape;
        this.model = model;
        this.year = year;
    }

    @Override
    public Car clone() {
        return new Car(engine.clone(), color, model, year);
    }
}

