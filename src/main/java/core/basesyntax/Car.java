package core.basesyntax;

public class Car implements Cloneable {

    private Engine engine;
    private String name;
    private String model;
    private String color;
    private String numberOfCar;

    public Car(Engine engine, String name, String model, String color, String numberOfCar) {
        this.engine = engine;
        this.name = name;
        this.model = model;
        this.color = color;
        this.numberOfCar = numberOfCar;
    }

    @Override
    public Car clone() {
        return new Car(engine.clone(), name, model, color, numberOfCar);
    }
}
