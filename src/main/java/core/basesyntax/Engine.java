package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int cylinderAmount;
    private float displacement;
    private int transmissionCount;
    private int power;

    public void setType(String type) {
        this.type = type;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public void setTransmissionCount(int transmissionCount) {
        this.transmissionCount = transmissionCount;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "type='" + type + '\''
                + ", cylinderAmount=" + cylinderAmount
                + ", displacement=" + displacement
                + ", transmissionCount=" + transmissionCount
                + ", power=" + power
                + '}';
    }
}
