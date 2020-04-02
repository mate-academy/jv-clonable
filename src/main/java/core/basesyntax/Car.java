package core.basesyntax;

public class Car implements Cloneable {

    private int wheelsCount;
    private String manufacturer;
    private String model;
    private int age;
    private int length;
    private Engine engine;

    public Car(int wheelsCount, String manufacturer,
               String model, int age, int length,
               Engine engine) {
        this.wheelsCount = wheelsCount;
        this.manufacturer = manufacturer;
        this.model = model;
        this.age = age;
        this.length = length;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(wheelsCount, manufacturer, model, age, length, engine.clone());
    }
}
