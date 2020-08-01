package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private Engine engine;
    private String color;
    private int doorCount;
    private int issueYear;

    public Car(String name, Engine engine, String color, int doorCount, int issueYear) {
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Engine cloneEngine = engine;
        Car cloneCar = new Car(name, cloneEngine, color, doorCount, issueYear);
        return cloneCar;
    }
}
