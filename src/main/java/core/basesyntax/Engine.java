package core.basesyntax;

public class Engine implements Cloneable {

    private int engineSpeeds;
    private int enginePower;
    private String engineType;
    private String engineYear;
    private int torque;

    public int getEngineSpeeds() {
        return engineSpeeds;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getEngineYear() {
        return engineYear;
    }

    public int getTorque() {
        return torque;
    }

    public Engine(int engineSpeeds, int enginePower, int torque,
                  String engineType, String engineYear) {
        this.engineSpeeds = engineSpeeds;
        this.enginePower = enginePower;
    }

    public Engine clone() throws CloneNotSupportedException {
        return new Engine(engineSpeeds, enginePower, torque, engineType, engineYear);
    }
}
