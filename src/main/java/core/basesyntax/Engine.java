package core.basesyntax;

public class Engine implements Cloneable {
    private int capacity;
    private String typeOfFuel;
    private int year;
    private String color;
    private int power;

    public int getEngineCapacity() {
        return capacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        capacity = engineCapacity;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine {"
                + "EngineCapacity = " + capacity
                + ", typeOfFuel = '" + typeOfFuel + '\''
                + ", year = " + year
                + ", color = '" + color + '\''
                + ", power = " + power
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create engine clone", e);
        }
    }
}
