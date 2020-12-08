package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private int weight;
    private int serialNumber;
    private int power;
    private String manufacturer;

    public double getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cant clone engine", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "volume=" + volume + ", weight=" + weight + ", serialNumber="
                + serialNumber + ", power=" + power + ", manufacturer='"
                + manufacturer + '\'' + '}';
    }
}
