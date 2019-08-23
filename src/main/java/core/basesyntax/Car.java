package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private String type;
    private int doorsQnty;
    private int maxSpeed;
    private Engine engine;

    public Car(String name, String color, String type, int doorsQnty, int maxSpeed, Engine engine) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.doorsQnty = doorsQnty;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(this.name, this.color, this.type, this.doorsQnty, this.maxSpeed,
                engine.clone());
    }

}
