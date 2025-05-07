package core.basesyntax;

public class Engine implements Cloneable {
    private String typeOfEngine;
    private int performancePower;
    private int serialNumber;
    private int cylindersNumber;
    private int soundLevel;

    public Engine(String typeOfEngine, int performancePower, int serialNumber,
                  int cylindersNumber, int soundLevel) {
        this.typeOfEngine = typeOfEngine;
        this.performancePower = performancePower;
        this.serialNumber = serialNumber;
        this.cylindersNumber = cylindersNumber;
        this.soundLevel = soundLevel;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setPerformancePower(int performancePower) {
        this.performancePower = performancePower;
    }

    public int getPerformancePower() {
        return performancePower;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    public int getCylindersNumber() {
        return cylindersNumber;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    @Override
    public String toString() {
        return "  Car's type of engine is " + typeOfEngine + "." + "\n"
                + "  Performance power - " + performancePower + " hp " + "." + "\n"
                + "  Serial number is № " + serialNumber + "." + "\n"
                + "  Cylinders number: " + cylindersNumber + "." + "\n"
                + "  Sound level is " + soundLevel + " decibels" + "." + "\n";

    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone...", e);
        }
    }
}
