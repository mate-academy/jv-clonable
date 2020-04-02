package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private int year;
    private String country;
    private double price;

    public Car(Engine engine, String color, int year, String country, double price) {
        this.engine = engine;
        this.color = color;
        this.year = year;
        this.country = country;
        this.price = price;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), color, year, country, price);
    }
}
