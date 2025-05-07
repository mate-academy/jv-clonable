package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String cylindersLocation;
    private int horsePower;
    private int torque;
    private double engineVolume;

    public Engine(String type,
                  String cylindersLocation,
                  int horsePower,
                  int torque,
                  double engineVolume) {
        this.type = type;
        this.cylindersLocation = cylindersLocation;
        this.horsePower = horsePower;
        this.torque = torque;
        this.engineVolume = engineVolume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCylindersLocation() {
        return cylindersLocation;
    }

    public void setCylindersLocation(String cylindersLocation) {
        this.cylindersLocation = cylindersLocation;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "type = '" + type + "'"
                + ", cylinders location = '" + cylindersLocation + "'"
                + ", horse power = '" + horsePower + "hp'"
                + ", torque = '" + torque + "Nm'"
                + ", engine volume = '" + engineVolume + "L'}";
    }

    @Override
    public Engine clone() {
        return new Engine(type, cylindersLocation, horsePower, torque, engineVolume);
    }
}
