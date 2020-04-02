package core.basesyntax;

import java.awt.Color;

public class Car implements Cloneable {
    private String carMake;
    private String modelOfCar;
    private Color colorCar;
    private int yearOfIssue;
    private boolean airBag;
    private Engine engine;

    public Car(String carMake, String modelOfCar, Color colorCar, int yearOfIssue, boolean airBag,
               Engine engine) {
        this.carMake = carMake;
        this.modelOfCar = modelOfCar;
        this.colorCar = colorCar;
        this.yearOfIssue = yearOfIssue;
        this.airBag = airBag;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car cloned = new Car(carMake, modelOfCar, colorCar, yearOfIssue, airBag, engine.clone());
        return cloned;
    }
}
