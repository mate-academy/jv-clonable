package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String name;
    private double price;
    private String model;
    private int yearOfProduction;

    public Car(Engine engine, String name, double price, String model, int yearOfProduction) {
        this.engine = engine;
        this.name = name;
        this.price = price;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{"
                + "engine=" + engine
                + ", name='" + name + '\''
                + ", price=" + price
                + ", model='" + model + '\''
                + ", yearOfProduction=" + yearOfProduction
                + '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone", e);
        }
    }
}
