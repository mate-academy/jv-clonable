package core.basesyntax;

public class Engine implements Cloneable {
    private String manufacturer;
    private String type;
    private int year;
    private int speed;
    private int power;

    public Engine(String manufacturer, String type, int year, int speed, int power) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.year = year;
        this.speed = speed;
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "manufacturer: " + manufacturer + ", type: "
                + type + ", year: " + year + ", speed: "
                + speed + " km/h, power:" + power;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone this engine object", e);
        }
    }
}
