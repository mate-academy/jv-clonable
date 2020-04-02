package core.basesyntax;

public class Engine implements Cloneable {
    private String engineType;
    private int cylindersNumber;
    private String transmissionType;
    private int enginePower;
    private int engineTorque;

    @Override
    protected Engine clone() {
        return new Engine();
    }
}
