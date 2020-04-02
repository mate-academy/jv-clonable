package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String number;
    private String bodyType;
    private String engineType;
    private Engine engine;

    public Car() {
    }

    public Car clone() throws CloneNotSupportedException {
        return (Car)super.clone();
    }
}
