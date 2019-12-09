package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private double power;
    private double price;
    private int weight;
    private boolean type;

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return (Engine)super.clone();
    }
}
