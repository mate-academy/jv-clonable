package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String engineConfiguration;
    private double engineVolume;
    private int horsePower;
    private boolean isTurboCharged;

    public Engine(String name, String engineConfiguration, double engineVolume, int horsePower,
                  boolean isTurbocharged) {
        this.name = name;
        this.engineConfiguration = engineConfiguration;
        this.engineVolume = engineVolume;
        this.horsePower = horsePower;
        this.isTurboCharged = isTurbocharged;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineConfiguration() {
        return engineConfiguration;
    }

    public void setEngineConfiguration(String engineConfiguration) {
        this.engineConfiguration = engineConfiguration;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }

    @Override
    public String toString() {
        return "Engine model: " + name + ", engine volume: " + engineVolume
                + ", cylinder configuration: " + engineConfiguration
                + ", has turbo: " + isTurboCharged + ", power: " + horsePower;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create engine clone!", e);
        }
    }
}
