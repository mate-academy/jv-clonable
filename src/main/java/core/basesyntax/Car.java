package core.basesyntax;

public class Car implements Cloneable {
    private String mark;
    private String color;
    private int maxSpeed;
    private int issueYear;
    private Engine engine;

    public Car(String mark, String color, int maxSpeed, int issueYear, Engine engine) {
        this.mark = mark;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.issueYear = issueYear;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(mark, color, maxSpeed, issueYear, engine.clone());
    }
}
