package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String name;
    private int price;
    private String color;
    private int age;

    public Car clone() {
        Car newCar = this.clone();
        newCar.engine = this.engine;
        newCar.color = this.color;
        newCar.name = this.name;
        return newCar;
    }
}
