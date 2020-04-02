package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private double weigth;
    private double size;
    private String name;
    private int power;

    public Engine clone() {
        Engine newEngine = this.clone();
        newEngine.name = this.name;
        newEngine.type = this.type;
        return newEngine;
    }
}
