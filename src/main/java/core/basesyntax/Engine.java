package core.basesyntax;

public class Engine implements Cloneable {
    private int param1;
    private int param2;
    private int param3;
    private int param4;
    private int param5;

    public Engine(int param1, int param2, int param3, int param4, int param5) {
        this.param5 = param5;
        this.param4 = param4;
        this.param3 = param3;
        this.param2 = param2;
        this.param1 = param1;
    }

    @Override
    public Engine clone() {
        return new Engine(param1, param2, param3, param4, param5);
    }
}
