package core.basesyntax;

public class Engine implements Cloneable {
    private static final String LINE_BREAKER = "\n";
    private static final String DOT = ".";
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
        return "  Car's type of engine is " + typeOfEngine + DOT + LINE_BREAKER
                + "  Performance power - " + performancePower + " hp " + DOT + LINE_BREAKER
                + "  Serial number is № " + serialNumber + DOT + LINE_BREAKER
                + "  Cylinders number: " + cylindersNumber + DOT + LINE_BREAKER
                + "  Sound level is " + soundLevel + " decibels" + DOT + LINE_BREAKER;

    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone...", e);
        }
    }
}
