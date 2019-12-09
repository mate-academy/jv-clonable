package core.basesyntax;

public class Car implements Cloneable {

    private String model;
    private String color;
    private int maxSpeed;
    private int year;
    private Engine engine;

    public Car(String model, String color, int maxSpeed, int year, Engine engine) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public Engine engine() {
        return engine;
    }

    public Car clone() throws CloneNotSupportedException {
        Car clonedCar = (Car)super.clone();
        return clonedCar;
    }
}
