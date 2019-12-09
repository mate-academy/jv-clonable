package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private int speed;
    private Engine engine;
    private int age;
    private String color;

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car car = (Car)super.clone();
        car.engine = engine.clone();
        return car;
    }
}
