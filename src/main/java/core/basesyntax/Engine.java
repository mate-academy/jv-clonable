package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private String model;
    private boolean wasRepaired;
    private int turbineCount;
    private String manufacturer;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWasRepaired() {
        return wasRepaired;
    }

    public void setWasRepaired(boolean wasRepaired) {
        this.wasRepaired = wasRepaired;
    }

    public int getTurbineCount() {
        return turbineCount;
    }

    public void setTurbineCount(int turbineCount) {
        this.turbineCount = turbineCount;
    }

    public String getWhoDevelop() {
        return manufacturer;
    }

    public void setWhoDevelop(String whoDevelop) {
        this.manufacturer = whoDevelop;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine class", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "power='" + power + '\''
                + "model='" + model + '\''
                + "turbineCount='" + turbineCount + '\''
                + "whoDevelop='" + manufacturer + '\''
                + "wasRepaired='" + wasRepaired + '\''
                + "}";
    }
}
