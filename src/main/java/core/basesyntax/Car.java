package core.basesyntax;

public class Car implements Cloneable {
    private String year;
    private String make;
    private String model;
    private String color;
    private int doorsQuantity;
    private Engine engine;

    public Car(String year, String make, String model, String color,
               int doorsQuantity, Engine engine) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.doorsQuantity = doorsQuantity;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(year, make, model, color, doorsQuantity, (Engine) engine.clone());
    }

}
