package core.basesyntax;

public class Engine implements Cloneable {
    private boolean isTurboCharged;
    private double engineCapacity;
    private int horsePower;
    private String engineConfiguration;
    private int valueCylinder;

    public Engine(boolean isTurboCharged, double engineCapacity, int horsePower,
                  String engineConfiguration, int valueCylinder) {
        this.isTurboCharged = isTurboCharged;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.engineConfiguration = engineConfiguration;
        this.valueCylinder = valueCylinder;
    }

    public boolean isTurbocharged() {
        return isTurboCharged;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getEngineConfiguration() {
        return engineConfiguration;
    }

    public int getValueCylinder() {
        return valueCylinder;
    }

    public void setTurbocharged(boolean isTurboCharged) {
        this.isTurboCharged = isTurboCharged;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setEngineConfiguration(String engineConfiguration) {
        this.engineConfiguration = engineConfiguration;
    }

    public void setValueCylinder(int valueCylinder) {
        this.valueCylinder = valueCylinder;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "turbocharged=" + isTurboCharged
                + ", engineCapacity=" + engineCapacity
                + ", horsePower=" + horsePower
                + ", engineConfiguration='" + engineConfiguration + '\''
                + ", valueCylinder=" + valueCylinder
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone!");
        }
    }
}
