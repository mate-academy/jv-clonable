package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String carBrand;
    private int countOfDoors;
    private String type;
    private Engine engine;

    public Car(String color, String carBrand, int countOfDoors, String type, Engine engine) {
        this.color = color;
        this.carBrand = carBrand;
        this.countOfDoors = countOfDoors;
        this.type = type;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(color, carBrand, countOfDoors, type, engine.clone());
    }
}
