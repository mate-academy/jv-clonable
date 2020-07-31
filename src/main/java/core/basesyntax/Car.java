package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private String model;
    private String manufactureYear;
    private int maxSpeed;
    private Engine engine;

    public Car(String name, String color, String model,
               String manufactureYear, int maxSpeed, Engine engine) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(name, color, model, manufactureYear, maxSpeed, engine.clone());
    }
}
