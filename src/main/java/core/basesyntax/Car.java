package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private String carBrand;
    private String fuelType;
    private String bodyType;

    public Engine getEngine() {
        return engine;
    }

    public Object clone() throws CloneNotSupportedException {
        Car car = (Car)super.clone();
        engine = car.getEngine();
        engine = new Engine();
        return car;
    }
}

