package core.basesyntax;

public class Engine implements Cloneable {
    private String developer;
    private int engineWeight;
    private int enginePower;
    private String engineMark;
    private int engineVolume;

    public Engine(String developer, int engineWeight, int enginePower,
                  String engineMark, int engineVolume) {
        this.developer = developer;
        this.engineWeight = engineWeight;
        this.enginePower = enginePower;
        this.engineMark = engineMark;
        this.engineVolume = engineVolume;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(int engineWeight) {
        this.engineWeight = engineWeight;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineMark() {
        return engineMark;
    }

    public void setEngineMark(String engineMark) {
        this.engineMark = engineMark;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "developer='" + developer + '\''
                + ", engineWeight=" + engineWeight
                + ", enginePower=" + enginePower
                + ", engineMark=" + engineMark
                + ", engineVolume=" + engineVolume
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't to create engine clone", e);
        }
    }
}
