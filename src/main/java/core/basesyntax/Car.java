package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private Color color;
    private double weight;
    private String model;
    private boolean isnew;

    private Car(Engine engine, Color color, double weight, String model, boolean isnew) {
        this.engine = engine.clone();
        this.color = color;
        this.weight = weight;
        this.model = model;
        this.isnew = isnew;
    }

    public Car clone() {
        return new Car(engine, color, weight, model, isnew);
    }

}
