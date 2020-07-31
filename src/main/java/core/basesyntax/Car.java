package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private int mileage;
    private int yearMade;
    private boolean isInsured;
    private Engine engine;

    public Car(String brand,
               int mileage,
               int yearMade,
               boolean isInsured,
               Engine engine) {
        this.brand = brand;
        this.mileage = mileage;
        this.yearMade = yearMade;
        this.isInsured = isInsured;
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = null;
        car = new Car(this.brand, this.mileage, this.yearMade, this.isInsured, this.engine);
        car.engine = (Engine) this.engine.clone();
        return car;
    }
}
