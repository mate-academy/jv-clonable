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
        Car cloneCar = (Car)super.clone();
        Engine cloneEngine = this.engine.clone();
        cloneCar.engine = cloneEngine;
        return cloneCar;
    }
}
