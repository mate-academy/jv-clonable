package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String transmission;
    private int yearOfManufacture;
    private int numberOfSeats;
    private int price;
    private Engine engine;

    public Car(String brand, String transmission, int yearOfManufacture,
               int numberOfSeats, int price, Engine engine) {
        this.brand = brand;
        this.transmission = transmission;
        this.yearOfManufacture = yearOfManufacture;
        this.numberOfSeats = numberOfSeats;
        this.price = price;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(brand, transmission, yearOfManufacture,
                        numberOfSeats, price, engine.clone());
    }
}
