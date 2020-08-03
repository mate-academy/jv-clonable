package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private Engine engine;
    private String color;
    private int doorCount;
    private int issueYear;

    public Car(String name, Engine engine, String color, int doorCount, int issueYear) {
        this.name = name;
        this.engine = engine;
        this.color = color;
        this.doorCount = doorCount;
        this.issueYear = issueYear;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car cloneCar = new Car(name, engine.clone(), color, doorCount, issueYear);
        return cloneCar;
    }
}
