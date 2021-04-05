package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private String color;
    private int yearOfProduction;
    private double mileage;
    private boolean automaticTransmission;

    public Car(Engine engine, String model, String color, int yearOfProduction,
               double mileage, boolean automaticTransmission) {
        this.engine = engine;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.mileage = mileage;
        this.automaticTransmission = automaticTransmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    @Override
    public Car clone() {
        try {

            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "engine=" + engine
                + ", model='" + model + '\''
                + ", color='" + color + '\''
                + ", yearOfProduction=" + yearOfProduction
                + ", mileage=" + mileage
                + ", automaticTransmission=" + automaticTransmission
                + '}';
    }

}
