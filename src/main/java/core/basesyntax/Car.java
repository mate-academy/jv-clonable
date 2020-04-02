package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String body;
    private String model;
    private String regNumber;
    private Engine engine;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Car();
    }
}

