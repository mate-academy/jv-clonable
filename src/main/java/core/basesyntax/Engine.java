package core.basesyntax;

public class Engine implements Cloneable {
    private String brand;
    private String model;
    private int volume;
    private int power;
    private int numberOfCylinders;

    public Engine(String brand, String model, int volume, int power, int numberOfCylinders) {
        this.brand = brand;
        this.model = model;
        this.volume = volume;
        this.power = power;
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }
}
