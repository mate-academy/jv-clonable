package core.basesyntax;

public class Car implements Cloneable{
    private String name;
    private String color;
    private String type;
    private int doorsQnty;
    private int maxSpeed;
    private Engine engine;

    public Car(String name, String color, String type, int doorsQnty, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.doorsQnty = doorsQnty;
        this.maxSpeed = maxSpeed;

        Engine engine = new Engine();
        engine.installEngine();
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(this.name, this.color, this.type, this.doorsQnty, this.maxSpeed);
    }

}
