package core.basesyntax;

public class Engine implements Cloneable {
    private double capacity;
    private int power;
    private double oil;
    private String typeFuel;
    private int price;

    public Engine(double capacity, int power, double oil, String typeFuel, int price) {
        this.capacity = capacity;
        this.power = power;
        this.oil = oil;
        this.typeFuel = typeFuel;
        this.price = price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getOil() {
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        return new Engine(capacity,power,oil,typeFuel,price);
    }
}
