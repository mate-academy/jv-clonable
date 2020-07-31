package core.basesyntax;

public class Car implements Cloneable {
    private String colour;
    private String model;
    private int weight;
    private Engine engine;
    private int numberOfSits;

    public Car(String colour, String model, int weight, Engine engine, int numberOfSits) {
        this.colour = colour;
        this.model = model;
        this.weight = weight;
        this.engine = engine;
        this.numberOfSits = numberOfSits;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = new Car(colour, model, weight, engine.clone(), numberOfSits);
        return car;
    }
}
