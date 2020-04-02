package core.basesyntax;

public class Engine implements Cloneable {
    private String engineType;
    private int engineVolume;
    private int weight;
    private int amountHP;
    private String fuelType;

    public Engine() {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Engine();
    }
}
