package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private int wight;
    private int height;
    private int length;
    private int weight;

    public Car(Engine engine, int wight, int height, int length, int weight) {
        this.engine = engine;
        this.wight = wight;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public Object clone() {
        return new Car(engine.clone(), wight, height, length, weight);
    }
}
