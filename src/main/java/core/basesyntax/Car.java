package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int year;
    private String country;
    private int cost;
    private Engine engine;

    public Car(String model, int year, String country, int cost, Engine engine) {
        this.model = model;
        this.year = year;
        this.country = country;
        this.cost = cost;
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getCost() {
        return cost;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model + '\''
                + ", year=" + year
                + ", country='" + country + '\''
                + ", cost=" + cost
                + ", engine=" + engine
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create car clone!");
        }
    }
}
