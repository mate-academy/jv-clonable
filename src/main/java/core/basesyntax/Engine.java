package core.basesyntax;

public class Engine implements Cloneable {
    private static final String LINE_BREAK = "\n";
    private String engineSerialNumber;
    private int horsePower;
    private String typeOfEngine;
    private String madeIn;
    private int numberOfCylinders;

    public Engine(String engineSerialNumber, int horsePower, String typeOfEngine,
                  String madeIn, int numberOfCylinders) {
        this.engineSerialNumber = engineSerialNumber;
        this.horsePower = horsePower;
        this.typeOfEngine = typeOfEngine;
        this.madeIn = madeIn;
        this.numberOfCylinders = numberOfCylinders;
    }

    public static String getLineBreak() {
        return LINE_BREAK;
    }

    public String getEngineSerialNumber() {
        return engineSerialNumber;
    }

    public void setEngineSerialNumber(String engineSerialNumber) {
        this.engineSerialNumber = engineSerialNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine parameters -> " + "serial number: " + engineSerialNumber + LINE_BREAK
                + " Engine type: " + typeOfEngine + LINE_BREAK
                + " Number of cylinders: " + numberOfCylinders + LINE_BREAK
                + " Horsepower: " + horsePower + LINE_BREAK
                + " Made in: " + madeIn + LINE_BREAK;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone engine", e);
        }
    }
}
