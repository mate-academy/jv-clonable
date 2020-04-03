package core.basesyntax;

public class Car implements Cloneable {
    private String type;
    private String brand;
    private String model;
    private int year;
    private String color;
    private String transmission;
    private Engine engine;

    public Car(String type, String brand, String model, int year,
               String color, String transmission, Engine engine) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(type, brand, model, year, color, transmission, engine);
    }
}
