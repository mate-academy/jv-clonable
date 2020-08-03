package core.basesyntax;

public class Engine implements Cloneable {

    private String model;
    private String type;
    private int power;
    private int frequency;
    private int weight;

    public Engine(String model, String type, int power, int frequency, int weight) {
        this.model = model;
        this.type = type;
        this.power = power;
        this.frequency = frequency;
        this.weight = weight;
    }

    @Override
    public Engine clone() {
        return new Engine(model, type, power, frequency, weight);
    }
}
