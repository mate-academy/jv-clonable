package core.basesyntax;

public class Car implements Cloneable {

    private String model;
    private String color;
    private int velocity;
    private Engine engine;
    private double timeFrom0To100;

    public Car(String model, String color, int velocity, Engine engine, double timeFrom0To100) {
        this.model = model;
        this.color = color;
        this.velocity = velocity;
        this.engine = engine;
        this.timeFrom0To100 = timeFrom0To100;
    }

    @Override
    public Car clone() {
        return new Car(model, color, velocity, engine.clone(), timeFrom0To100);
    }

}
