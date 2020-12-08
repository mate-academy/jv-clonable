package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private int yearMade;
    private String color;
    private int price;
    private String country;
    private String name;

    @Override
    public String toString() {
        return "Car{"
                + "engine=" + engine
                + ", yearMade=" + yearMade
                + ", color='" + color + '\''
                + ", price=" + price
                + ", country='" + country + '\''
                + ", name='" + name + '\''
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car Clone", e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
