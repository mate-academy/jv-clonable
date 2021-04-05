package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int cylinderAmount;
    private float displacement;
    private int transmissionCount;
    private int power;

    public Engine(String type, int cylinderAmount,
                  float displacement, int transmissionCount, int power) {
        this.type = type;
        this.cylinderAmount = cylinderAmount;
        this.displacement = displacement;
        this.transmissionCount = transmissionCount;
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
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
