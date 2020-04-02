package core.basesyntax;

public class Engine implements Cloneable {
    private int age;
    private String type;
    private int serialNumber;
    private int power;
    private int price;

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine();
    }
}
