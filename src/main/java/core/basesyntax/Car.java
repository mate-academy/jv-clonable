package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private Engine engine;
    private String color;
    private int doorCount;
    private int issueYear;

    public Car(String name, Engine engine, String color, int doorCount, int issueYear) {
        name = name;
        engine = engine;
        color = color;
        doorCount = doorCount;
        issueYear = issueYear;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Engine cloneEngine = engine;
        Car cloneCar = new Car(name, cloneEngine, color, doorCount, issueYear);
        return cloneCar;
    }
}
