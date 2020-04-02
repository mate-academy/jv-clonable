package core.basesyntax;

public class Car implements Cloneable {
    private String mark;
    private String type;
    private int maxSpeed;
    private String color;
    private Engine nameEngine;

    @Override
    public Car clone() {
        Car clonedCar = new Car();
        clonedCar.mark = this.mark;
        clonedCar.type = this.type;
        clonedCar.maxSpeed = this.maxSpeed;
        clonedCar.color = this.color;
        clonedCar.nameEngine = this.nameEngine;
        return clonedCar;
    }

}
