package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String typeEngine;
    private double engineCapacity;
    private int horsePowers;
    private int weight;

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine();
    }
}
