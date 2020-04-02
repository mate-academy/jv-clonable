package core.basesyntax;

public class Engine implements Cloneable {
    private int param1;
    private int param2;
    private int param3;
    private int param4;
    private int param5;

    public Engine() {
    }

    public Engine clone() throws CloneNotSupportedException {
        return (Engine)super.clone();
    }
}
