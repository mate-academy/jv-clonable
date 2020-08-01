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
        Engine cloneEngine = this.engine;
        Car cloneCar = new Car(this.name, cloneEngine, this.color, this.doorCount, this.issueYear);
        return cloneCar;
    }
}
