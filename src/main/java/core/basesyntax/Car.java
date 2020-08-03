package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String color;
    private String model;
    private int price;
    private int passengerCapacity;
    private String gasType;

    public Car(Engine engine, String color, String model, int price,
               int passengerCapacity, String gasType) {
        this.engine = engine;
        this.color = color;
        this.model = model;
        this.price = price;
        this.passengerCapacity = passengerCapacity;
        this.gasType = gasType;
    }

    @Override
    public Car clone() {
        return new Car(engine.clone(), color, model, price, passengerCapacity, gasType);
    }
}
