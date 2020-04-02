package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String color;
    private String bodyType;
    private int maxSpeed;
    private Engine engine;

    public Car() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Car();
    }
}
