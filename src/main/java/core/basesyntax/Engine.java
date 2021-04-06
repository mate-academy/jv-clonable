package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int power;
    private int volume;
    private int numberOfCylinders;
    private int diameter;

    @Override
    public String toString() {
        return "Engine{" + "type='" + type + '\''
                + ", enginePower=" + power + ", volume="
                + volume + ", numberOfCylinders=" + numberOfCylinders
                + ", diameter=" + diameter + '}';
    }

    public String getColor() {
        return type;
    }

    public void setColor(String color) {
        this.type = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }
}
