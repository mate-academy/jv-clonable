package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String cylindersLocation;
    private int horsePower;
    private int torque;
    private double engineVolume;

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
        try {
            Engine clonedEngine = (Engine) super.clone();
            clonedEngine.setType(type);
            clonedEngine.setCylindersLocation(cylindersLocation);
            clonedEngine.setHorsePower(horsePower);
            clonedEngine.setTorque(torque);
            clonedEngine.setEngineVolume(engineVolume);
            return clonedEngine;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine copy", e);
        }
    }
}
