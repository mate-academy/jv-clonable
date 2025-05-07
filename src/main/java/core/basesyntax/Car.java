package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private int productionYear;
    private String transmission;
    private Engine engine;

    public Car(String brand, String model, int productionYear, String transmission, Engine engine) {
        this.model = model;
        this.productionYear = productionYear;
        this.brand = brand;
        this.transmission = transmission;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car: { brand = "
                + brand + ", model = "
                + model + ",productionYear = "
                + productionYear + ", transmission = "
                + transmission + ", engine = "
                + engine + "}";
    }

    @Override
    public Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngine(engine.clone());
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone car ", e);
        }
    }
}
