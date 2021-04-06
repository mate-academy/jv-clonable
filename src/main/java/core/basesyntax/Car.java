package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private String country;
    private int year;
    private boolean isComfortable;
    private Engine engine;

    public Car(String model, String color, String country, int year,
               boolean isComfortable, Engine engine) {
        this.model = model;
        this.color = color;
        this.country = country;
        this.year = year;
        this.isComfortable = isComfortable;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isComfortable(boolean b) {
        return isComfortable;
    }

    public void setComfortable(boolean comfortable) {
        isComfortable = comfortable;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", country='" + country + '\''
                + ", year=" + year
                + ", isComfortable=" + isComfortable
                + ", engine=" + engine
                + '}';
    }

    @Override
    protected Car clone() {
        try {
            Car cloneCar = (Car) super.clone();
            cloneCar.setEngine(engine.clone());
            return cloneCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone!", e);
        }
    }
}
