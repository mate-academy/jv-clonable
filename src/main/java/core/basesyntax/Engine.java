package core.basesyntax;

public class Engine implements Cloneable {

    private int levelOfNoise;
    private int numOfCylinders;
    private int power;
    private String typeOfFuel;
    private String typeOfCooling;

    @Override
    public Engine clone() {
        return new Engine();
    }
}
