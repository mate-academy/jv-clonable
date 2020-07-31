package core.basesyntax;

public class Car implements Cloneable {

    private String model;
    private String type;
    private String countryOfProduction;
    private int yearOfProduction;
    private int price;
    private Engine engine;

    public Car(String model, String type, String countryOfProduction,
                int yearOfProduction, int price, Engine engine) {
        this.model = model;
        this.type = type;
        this.countryOfProduction = countryOfProduction;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(model, type, countryOfProduction,
        yearOfProduction, price, engine);
    }
}
