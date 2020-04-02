package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private double weigth;
    private double size;
    private String name;
    private int power;

    public Engine(String type, double weigth, double size, String name, int power) {
        this.type = type;
        this.weigth = weigth;
        this.size = size;
        this.name = name;
        this.power = power;
    }

    public Engine clone() {
        return new Engine(type, weigth, size, name, power);
    }
}
