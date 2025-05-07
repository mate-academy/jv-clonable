package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int number;
    private Engine engine;
    private String color;
    private int gasolineVolume;

    public Car(String model, int number, Engine engine, String color, int gasolineVolume) {
        this.model = model;
        this.number = number;
        this.engine = engine;
        this.color = color;
        this.gasolineVolume = gasolineVolume;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public Car clone() {
        return new Car(model, number, engine.clone(), color, gasolineVolume);
    }

    @Override
    public String toString() {
        return "Car{ model='" + model + '\'' + ", number=" + number
                + ", engine=" + engine + ", color='" + color + '\''
                + ", gasolineVolume=" + gasolineVolume + '}';
    }
}
