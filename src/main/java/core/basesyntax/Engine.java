package core.basesyntax;

public class Engine implements Cloneable {
    private int horsePower;
    private String color;
    private String typeOfEngine;
    private String stateOfEngine;
    private int torque;

    public Engine(int horsePower, String color,
                  String typeOfEngine, String stateOfEngine, int torque) {
        this.horsePower = horsePower;
        this.color = color;
        this.typeOfEngine = typeOfEngine;
        this.stateOfEngine = stateOfEngine;
        this.torque = torque;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void setStateOfEngine(String stateOfEngine) {
        this.stateOfEngine = stateOfEngine;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "horsePower=" + horsePower
                + ", color='" + color + '\''
                + ", typeOfEngine='" + typeOfEngine + '\''
                + ", stateOfEngine='" + stateOfEngine + '\''
                + ", torque=" + torque
                + '}';
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine object", e);
        }
    }
}
