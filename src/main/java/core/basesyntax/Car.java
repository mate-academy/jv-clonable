package core.basesyntax;

public class Car implements Cloneable{
    private String carName;
    private String model;
    private String color;
    private Engine engine;
    private int year;

    public Car(String carName, String model, String color, Engine engine, int year) {
        this.carName = carName;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.year = year;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(carName, model,color, engine.clone(), year);
    }
}
