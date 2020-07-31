package core.basesyntax;

public class Car implements Cloneable {
    private int maxSpeed;
    private String transmission;
    private String color;
    private String mark;
    private Engine carEngine;

    public Car(int maxSpeed, String transmission, String color, String mark, Engine carEngine) {
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.color = color;
        this.mark = mark;
        this.carEngine = carEngine;
    }

    public Car clone(Car car) {
        return new Car(car.maxSpeed, car.transmission, car.color, car.mark, car.carEngine);
    }
}
