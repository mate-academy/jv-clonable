package core.basesyntax;

public class Engine implements Cloneable {

    private String name;
    private String model;
    private int volume;
    private int cylindersNumber;
    private boolean isAirBoosted;

    public Engine(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Engine(String name, String model,
                  int volume, int cylindersNumber, boolean isAirBoosted) {
        this.name = name;
        this.model = model;
        this.volume = volume;
        this.cylindersNumber = cylindersNumber;
        this.isAirBoosted = isAirBoosted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCylindersNumber() {
        return cylindersNumber;
    }

    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    public boolean isAirBoosted() {
        return isAirBoosted;
    }

    public void setAirBoosted(boolean airBoosted) {
        isAirBoosted = airBoosted;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "name='" + name + '\''
                + ", model='" + model + '\''
                + ", volume=" + volume
                + ", cylindersNumber=" + cylindersNumber
                + ", isAirBoosted=" + isAirBoosted + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone the engine", e);
        }
    }
}
