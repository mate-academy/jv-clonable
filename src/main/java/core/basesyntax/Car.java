package core.basesyntax;

public class Car implements Cloneable {
    private int howOld;
    private String name;
    private String type;
    private Engine engine;
    private int lastTechnicalCheckYear;

    public Car(int howOld, String name, String type, Engine engine, int lastTechnicalCheckYear) {
        this.howOld = howOld;
        this.name = name;
        this.type = type;
        this.engine = engine;
        this.lastTechnicalCheckYear = lastTechnicalCheckYear;
    }

    @Override
    public Car clone() {
        return new Car(howOld, name, type, engine.clone(), lastTechnicalCheckYear);
    }
}
