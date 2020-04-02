package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String colour;
    private String name;
    private String type;
    private int yearOfIssue;

    public Car(Engine engine, String colour, String name, String type, int yearOfIssue) {
        this.engine = engine;
        this.colour = colour;
        this.name = name;
        this.type = type;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), colour, name, type, yearOfIssue);
    }
}
