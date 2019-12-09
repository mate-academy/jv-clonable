package core.basesyntax;

public class Car implements Cloneable {

    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int win;
    private int yearOfIssue;
    private Engine engine;

    public Car(String brand, String model, String color, String bodyType,
               int win, int yearOfIssue, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.win = win;
        this.yearOfIssue = yearOfIssue;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(brand, model, color, bodyType, win, yearOfIssue, engine.clone());
    }
}
