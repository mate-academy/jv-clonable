package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String manufacturer;
    private int productionYear;
    private int numberOfPassengers;
    private Engine engine;

    public Car(String model, String manufacturer, int productionYear,
               int numberOfPassengers, Engine engine) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.numberOfPassengers = numberOfPassengers;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\''
                + ", manufacturer='" + manufacturer + '\''
                + ", productionYear=" + productionYear
                + ", numberOfPassengers=" + numberOfPassengers
                + ", engine=" + engine
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t Cer clone", e);
        }
    }
}
