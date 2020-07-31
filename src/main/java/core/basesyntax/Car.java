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

    @Override
    public Car clone() {
        return new Car(maxSpeed, transmission, color, mark, carEngine.clone());
    }
}
