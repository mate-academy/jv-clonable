package core.basesyntax;

public class Car implements Cloneable {
    private String formFactor;
    private String color;
    private double maxSpeed;
    private byte doorsCount;
    private Engine engine;

    public Car(String formFact, String col, double maxSp,
               byte doors, Engine eng) {
        formFactor = formFact;
        color = col;
        maxSpeed = maxSp;
        doorsCount = doors;
        engine = eng;
    }

    @Override
    public Car clone() {
        return new Car(formFactor, color, maxSpeed, doorsCount, engine.clone());
    }
}
