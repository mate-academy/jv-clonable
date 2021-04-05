package core.basesyntax;

public class Car implements Cloneable {
    private String producer;
    private String model;
    private Engine engine;
    private String color;
    private short year;

    public Car(String producer, String model, Engine engine, String color, short year) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public Car setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public short getYear() {
        return year;
    }

    public Car setYear(short year) {
        this.year = year;
        return this;
    }

    @Override
    public Car clone() {
        return new Car(producer, model, engine.clone(), color, year);
    }

    @Override
    public String toString() {
        return "Car{"
                + "producer='" + producer + '\''
                + ", model='" + model + '\''
                + ", engine=" + engine
                + ", color='" + color + '\''
                + ", year=" + year
                + '}';
    }
}
