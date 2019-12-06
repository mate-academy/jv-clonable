package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private int year;
    private int avgSpeed;
    private int maxSpeed;

    public Car(Engine engine, String model, int year, int avgSpeed, int maxSpeed) {
        this.engine = engine;
        this.model = model;
        this.year = year;
        this.avgSpeed = avgSpeed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public Car clone() {
        Engine clonedEngine = engine.clone();
        Car clonedCar = new Car(clonedEngine, model, year, avgSpeed, maxSpeed);
        return clonedCar;
    }

}
