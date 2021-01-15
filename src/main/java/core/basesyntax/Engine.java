package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private double volume;
    private int year;
    private int power;
    private int price;

    public Engine(String type, double volume, int year, int power, int price) {
        this.type = type;
        this.volume = volume;
        this.year = year;
        this.power = power;
        this.price = price;
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t create Engine clone", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{" + "type='" + type
                + '\'' + ", volume=" + volume
                + ", year=" + year
                + ", power=" + power
                + ", price=" + price
                + '}';
    }
}
