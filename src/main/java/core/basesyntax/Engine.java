package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String serialNumber;
    private int price;
    private int volume;
    private int power;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public Engine(String type, String serialNumber, int price, int volume, int power) {
        this.type = type;
        this.serialNumber = serialNumber;
        this.price = price;
        this.volume = volume;
        this.power = power;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(type,serialNumber,price,volume,power);
    }
}
