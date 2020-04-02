package core.basesyntax;

public class Engine implements Cloneable {

    private String model;
    private String type;
    private int power;
    private String size;
    private int dateOf;

    public Engine(String model, String type, int power, String size, int dateOf) {
        this.model = model;
        this.type = type;
        this.power = power;
        this.size = size;
        this.dateOf = dateOf;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Engine(model, type, power, size, dateOf);
    }
}
