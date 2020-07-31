package core.basesyntax;

public class Engine implements Cloneable {
    private String carModel;
    private boolean isUsed;
    private int yearOfProduction;
    private String fuelType;
    private double capacity;

    public Engine(String carModel, boolean isUsed, int yearOfProduction,
                  String fuelType, double capacity) {
        this.carModel = carModel;
        this.isUsed = isUsed;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(carModel, isUsed, yearOfProduction, fuelType, capacity);
    }

}
