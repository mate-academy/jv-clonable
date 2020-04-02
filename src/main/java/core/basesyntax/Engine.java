package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String typeEngine;
    private double engineCapacity;
    private int horsePowers;
    private int weight;

    public Engine(String name, String typeEngine,
                  double engineCapacity,
                  int horsePowers, int weight) {
        this.name = name;
        this.typeEngine = typeEngine;
        this.engineCapacity = engineCapacity;
        this.horsePowers = horsePowers;
        this.weight = weight;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(name, typeEngine, engineCapacity, horsePowers, weight);
    }
}
