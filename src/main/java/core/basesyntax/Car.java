package core.basesyntax;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String color;
    private int warranty;
    private boolean insurance;
    private Engine engine;

    public Car(String brand, String model, String color,
               int warranty, boolean insurance, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.warranty = warranty;
        this.insurance = insurance;
        this.engine = engine;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getWarranty() {
        return warranty;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(this.getBrand(), this.getModel(), this.getColor(),
                this.getWarranty(), this.isInsurance(), this.getEngine().clone());
    }
}
