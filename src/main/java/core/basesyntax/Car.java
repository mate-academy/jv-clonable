package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String colour;
    private String type;
    private int yearOfManufacture;
    private int maxSpeed;
    private Engine engine;

    public Car(String model, String colour, String type, int maxSpeed, int yearOfManufacture, Engine engine) {
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
    }

    public void gas() {
        System.out.println("Автомобиль тронулся...");
    }

    public void brake() {
        System.out.println("Автомобиль затормозил...");
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(model, colour, type, maxSpeed, yearOfManufacture, engine.clone());
    }
}
