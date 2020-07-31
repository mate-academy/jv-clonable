package core.basesyntax;

public class Car implements Cloneable {
    private String nameOwner;
    private String color;
    private String brand;
    private int numbers;
    private int parkingLot;
    private Engine engine;

    public Car(String nameOwner, String color, String brand, int numbers,
               int parkingLot, Engine clone) {
        this.nameOwner = nameOwner;
        this.color = color;
        this.brand = brand;
        this.numbers = numbers;
        this.parkingLot = parkingLot;
    }

    protected Car clone() {
        return new Car(nameOwner, color, brand, numbers, parkingLot, engine.clone());
    }
}

