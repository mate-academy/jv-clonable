package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private int year;
    private String name;
    private int numberOfCylinders;
    private String color;

    Engine(int power, int year, String name, int numberOfCylinders, String color) {
        this.power = power;
        this.year = year;
        this.name = name;
        this.numberOfCylinders = numberOfCylinders;
        this.color = color;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{"
                + "power : " + power
                + "year : " + year
                + "name : " + name
                + "number of cylinders : " + numberOfCylinders
                + "color : " + color
                + "}";
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone the car", e);
        }
    }
}
