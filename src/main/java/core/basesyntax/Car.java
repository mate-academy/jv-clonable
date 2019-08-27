package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private Integer speed;
    private String type;
    private Engine engine;

    public Car(String name, String color, Integer speed, String type, Engine engine) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.type = type;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car)super.clone();
    }
}
