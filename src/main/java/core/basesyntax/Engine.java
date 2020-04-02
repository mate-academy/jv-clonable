package core.basesyntax;

public class Engine implements Cloneable {
    private String engineType;
    private int cylindersNumber;
    private String transmissionType;
    private int enginePower;
    private int engineTorque;

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setEngineTorque(int engineTorque) {
        this.engineTorque = engineTorque;
    }

    @Override
    protected Engine clone() {
        return new Engine();
    }
}
