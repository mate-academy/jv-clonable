package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private int yearOfMade;
    private String model;
    private String producer;
    private int price;

    public Car(Engine engine, int yearOfMade, String model, String producer, int price) {
        this.engine = engine;
        this.yearOfMade = yearOfMade;
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), yearOfMade, model, producer, price);
    }

}
