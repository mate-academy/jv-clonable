package core.basesyntax;

public class Car implements Cloneable {

    private Engine engine;
    private String name;
    private String model;
    private String color;
    private String numberOfCar;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(engine.clone());
    }
}
