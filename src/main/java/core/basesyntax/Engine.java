package core.basesyntax;

public class Engine implements Cloneable {
    private int id;
    private int weight;
    private String model;
    private String color;
    private int power;

    public Engine(int id, int weight, String model, String color, int power) {
        this.id = id;
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.power = power;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        Engine engine = (Engine) super.clone();
        return engine;
    }
}
