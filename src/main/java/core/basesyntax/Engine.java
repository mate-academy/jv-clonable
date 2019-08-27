package core.basesyntax;

public class Engine implements Cloneable {
    private String manufacturer;
    private String supply;
    private int power;
    private char type;
    private boolean condition;

    public Engine(String manufacturer, String supply, int power, char type, boolean condition) {
        this.manufacturer = manufacturer;
        this.supply = supply;
        this.power = power;
        this.type = type;
        this.condition = condition;
    }

    @Override
    public Engine clone() {
        return new Engine(this.manufacturer, this.supply, power, type, condition);
    }
}
