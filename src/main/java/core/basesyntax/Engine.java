package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String name;
    private double power;
    private int yearOfProduction;
    private double price;

    public Engine(String model, String name, double power, int yearOfProduction, double price) {
        this.model = model;
        this.name = name;
        this.power = power;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + model + '\''
                + ", name='" + name + '\''
                + ", power=" + power
                + ", yearOfProduction=" + yearOfProduction
                + ", price=" + price
                + '}';

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone", e);
        }
    }
}
