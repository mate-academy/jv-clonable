package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String typeEngine;
    private double engineCapacity;
    private int horsePowers;
    private int weight;

    public Engine(String nm, String te, double ec, int hp, int wt) {
        name = nm;
        typeEngine = te;
        engineCapacity = ec;
        horsePowers = hp;
        weight = wt;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(name, typeEngine, engineCapacity, horsePowers, weight);
    }
}
