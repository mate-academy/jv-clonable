package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private int yearOfMade;
    private int mileage;
    private int weight;
    private Engine engine;

    public Car(String brand, String model, int yearOfMade, int mileage, int weight, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.yearOfMade = yearOfMade;
        this.mileage = mileage;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(brand, model, yearOfMade, mileage, weight, engine.clone());
    }
}
