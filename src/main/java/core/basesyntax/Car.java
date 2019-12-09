package core.basesyntax;

public class Car implements Cloneable {

    private Engine engine;
    private String model;
    private String color;
    private String roofType;
    private int yearOfProduction;

    public Car(Engine engine, String model, String color, String roofType, int yearOfProduction) {
        this.engine = engine;
        this.model = model;
        this.color = color;
        this.roofType = roofType;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car clonedCar = new Car(engine, model, color, roofType, yearOfProduction);
        clonedCar.engine = (Engine) clonedCar.engine.clone();
        return clonedCar;
    }
}
