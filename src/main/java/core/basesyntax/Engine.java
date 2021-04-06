package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private int cylinderNumber;
    private int speed;
    private int maximumPower;
    private int year;

    public Engine(String name, int cylinderNumber, int speed, int maximumPower, int year) {
        this.name = name;
        this.cylinderNumber = cylinderNumber;
        this.speed = speed;
        this.maximumPower = maximumPower;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getCylinderNumber() {
        return cylinderNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaximumPower() {
        return maximumPower;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCylinderNumber(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMaximumPower(int maximumPower) {
        this.maximumPower = maximumPower;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "name = '" + name + "'"
                + ", cylinderNumber = '" + cylinderNumber + "'"
                + ", speed = '" + speed + "'"
                + ", maximumPower = '" + maximumPower + "'"
                + ", year = " + year
                + "}";
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
