package core.basesyntax;

public class Engine implements Cloneable {
    private boolean turbocharged;
    private double engineCapacity;
    private int horsePower;
    private String engineConfiguration;
    private int valueCylinder;

    public Engine(boolean turbocharged, double engineCapacity, int horsePower,
                  String engineConfiguration, int valueCylinder) {
        this.turbocharged = turbocharged;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.engineConfiguration = engineConfiguration;
        this.valueCylinder = valueCylinder;
    }

    public boolean isTurbocharged() {
        return turbocharged;
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

    public void setTurbocharged(boolean turbocharged) {
        this.turbocharged = turbocharged;
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
                + "turbocharged=" + turbocharged
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


