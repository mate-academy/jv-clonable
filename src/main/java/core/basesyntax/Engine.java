package core.basesyntax;

public class Engine implements Cloneable {
    private int length;
    private int width;
    private int year;
    private int power;
    private String color;

    Engine(int length, int width, int year, int power, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.year = year;
        this.power = power;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getYear() {
        return year;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "This car's engine length is " + getLength() + ", width " + getWidth()
                + ". This engine is of " + getYear() + " year, " + getColor() + " color.";
    }

    public Engine clone() {
        try {
            Engine clonedEngine = (Engine) super.clone();
            return clonedEngine;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone the engine", e);
        }
    }
}
