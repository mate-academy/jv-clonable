package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private Engine engine;
    private String color;
    private String type;
    private boolean isElectricCar;

    public Car(String name, Engine engine, String color, String type, boolean isElectricCar) {
        this.name = name;
        this.engine = engine;
        this.color = color;
        this.type = type;
        this.isElectricCar = isElectricCar;
    }

    @Override
    public Car clone() {
        return new Car(name, engine.clone(), color, type, isElectricCar);
    }
}
