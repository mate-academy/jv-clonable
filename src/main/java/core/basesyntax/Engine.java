package core.basesyntax;

public class Engine implements Cloneable {
    private int ne;
    private int cylinders;
    private int mk;
    private int nd;
    private int sd;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
