package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String name;
    private int price;
    private int power;
    private int reliability; // how many years of work is it designed for

    public Engine(String model,String name,
               int price, int power, int reliability) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.power = power;
        this.reliability = reliability;
    }

    @Override
    public Engine clone() {
        return new Engine(model, name, price, power, reliability);
    }

}
