package core.basesyntax;

public class Engine implements Cloneable {
    private String engineType;
    private int cylindersNumber;
    private String transmissionType;
    private int enginePower;
    private int engineTorque;

    public Engine(String engineType, int cylindersNumber, String transmissionType, int enginePower, int engineTorque) {
        this.engineType = engineType;
        this.cylindersNumber = cylindersNumber;
        this.transmissionType = transmissionType;
        this.enginePower = enginePower;
        this.engineTorque = engineTorque;
    }

    @Override
    public Engine clone() {
        return new Engine(engineType, cylindersNumber, transmissionType, enginePower, engineTorque);
    }
}
