package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private Color color;
    private double weight;
    private String model;
    private boolean isnew;

    private Car(Engine engine, Color color, double weight, String model, boolean isnew) {
        this.engine = engine;
        this.color = color;
        this.weight = weight;
        this.model = model;
        this.isnew = isnew;
    }

    public Car clone() {
        Car car = new Car();
        car.color = color;
        car.engine = engine;
        car.model = model;
        car.weight = weight;
        car.isnew = isnew;
        return car;
    }

}
