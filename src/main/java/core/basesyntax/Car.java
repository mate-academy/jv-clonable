package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String brand;
    private String type;
    private double weight;
    private int yearBuilt;
    private final String vehicleIdNumber;

    public Car(Engine engine, String brand, String type,
               double weight, int yearBuilt, String vehicleIdNumber) {
        this.engine = engine;
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.yearBuilt = yearBuilt;
        this.vehicleIdNumber = vehicleIdNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getVehicleIdNumber() {
        return vehicleIdNumber;
    }

    private void startEngine() {
        System.out.println("Engine started");
    }

    private void stopEngine() {
        System.out.println("Engine stopped");
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(this.engine.clone(), this.brand, this.type,
                this.weight, this.yearBuilt, this.vehicleIdNumber);
    }
}
