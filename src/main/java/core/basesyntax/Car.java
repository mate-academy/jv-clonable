package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int yearOfProduction;
    private Engine engine;
    private int mileage;

    public Car(String model, String color, int yearOfProduction, Engine engine, int mileage) {
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();
        newCar.engine = engine.clone();

        return newCar;
    }
}
