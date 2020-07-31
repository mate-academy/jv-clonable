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

    public Car clone() {
        return new Car(brand, transmission, yearOfManufacture, numberOfSeats, price, engine);
    }
}
