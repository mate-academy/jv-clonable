package core.basesyntax;

public class Car implements Cloneable {
    private String carBrand;
    private String model;
    private String number;
    private int yearOfCarProduction;
    private int fuelCapacity;
    private Engine carEngine;

    public Car(String carBrand, String model, String number,
               int yearOfCarProduction, int fuelCapacity, Engine carEngine) {
        this.carBrand = carBrand;
        this.model = model;
        this.number = number;
        this.yearOfCarProduction = yearOfCarProduction;
        this.fuelCapacity = fuelCapacity;
        this.carEngine = carEngine;
    }

    @Override
    public String toString() {
        return "................................." + System.lineSeparator()
                + "Car:" + System.lineSeparator()
                + "Car brand = '" + carBrand + '\'' + System.lineSeparator()
                + "Model = '" + model + '\'' + System.lineSeparator()
                + "Number = '" + number + '\'' + System.lineSeparator()
                + "Year of car production = " + yearOfCarProduction + System.lineSeparator()
                + "Fuel capacity = " + fuelCapacity + System.lineSeparator()
                + "- Car engine: " + carEngine
                + System.lineSeparator();
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setCarEngine(carEngine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    private void setCarEngine(Engine carEngine) {
        this.carEngine = carEngine;
    }

    public void setYearOfCarProduction(int yearOfCarProduction) {
        this.yearOfCarProduction = yearOfCarProduction;
    }
}
