package core.basesyntax;

public class Car implements Cloneable {

    private String carBrand;
    private String yearOfProduction;
    private String color;
    private int maxSpeed;
    private Engine engine;

    public Car(String carBrand, String yearOfProduction,
               String color, int maxSpeed, Engine engine) {
        this.carBrand = carBrand;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(carBrand, yearOfProduction, color, maxSpeed, engine.clone());
    }
}
