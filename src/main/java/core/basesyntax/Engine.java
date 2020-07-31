package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String transmission;
    private String injection;
    private int gears;
    private double enginVolume;

    @Override
    protected Engine clone() {
        return new Engine();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getInjection() {
        return injection;
    }

    public void setInjection(String injection) {
        this.injection = injection;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public double getEnginVolume() {
        return enginVolume;
    }

    public void setEnginVolume(double enginVolume) {
        this.enginVolume = enginVolume;
    }
}
