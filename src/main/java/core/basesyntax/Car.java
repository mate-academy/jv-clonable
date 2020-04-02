package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String name;
    private String govNumber;
    private String bodyType;
    private String color;

    public Car(Engine engine, String name, String govNumber, String bodyType, String color) {
        this.engine = engine;
        this.name = name;
        this.govNumber = govNumber;
        this.bodyType = bodyType;
        this.color = color;

    }

    @Override
    public Car clone() {
        return new Car(engine.clone(), name, govNumber, bodyType, color);
    }
}
