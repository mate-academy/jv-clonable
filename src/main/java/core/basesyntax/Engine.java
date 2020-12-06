package core.basesyntax;

public class Engine implements Cloneable {
    private int numberOfCylinders;
    private double engineCapacity;
    private int yearsOfEngine;
    private String typeOfEngine;
    private boolean isWorkable;

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYear() {
        return yearsOfEngine;
    }

    public void setYear(int year) {
        this.yearsOfEngine = year;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable) {
        isWorkable = workable;
    }

    @Override
    public String toString() {
        return "Engine : "
                + "number of cylinders = " + numberOfCylinders
                + ", engine capacity = " + engineCapacity
                + ", engine years = " + yearsOfEngine
                + ", type of engine = " + typeOfEngine
                + ", is working? = " + isWorkable + ".";
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
