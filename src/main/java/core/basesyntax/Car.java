package core.basesyntax;

public class Car implements Cloneable {

    private Engine engine;
    private String name;
    private String model;
    private String color;
    private String numberOfCar;

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car cloneOfCar = (Car) super.clone();
        cloneOfCar.engine = this.engine.clone();
        return cloneOfCar;
    }
}
