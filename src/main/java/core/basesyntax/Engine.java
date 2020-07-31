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
    public Object clone() throws CloneNotSupportedException {
        // var 1
        //return new Engine(id, weight, model, color, power);

        // var 2
        // Engine engine = (Engine) super.clone();
        // return engine;

        // var 3
        return super.clone();
    }
}
