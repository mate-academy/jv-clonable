package core.basesyntax;

public class Car implements Cloneable {
    private String manufacturer;
    private String color;
    private int year;
    private boolean isElectric;
    private Engine engine;

    public Car(String manufacturer, String color, int year, boolean isElectric, Engine engine) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.year = year;
        this.isElectric = isElectric;
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "manufacturer = '" + manufacturer + "'"
                + ", color = '" + color + "'"
                + ", year = '" + year + "'"
                + ", isElectric = '" + isElectric + "'"
                + ", engine = " + engine
                + "}";
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone this car object", e);
        }
    }
}
