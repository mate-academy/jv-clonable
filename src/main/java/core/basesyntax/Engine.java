package core.basesyntax;

public class Engine implements Cloneable {
    private int cilindersNumber;
    private int volumeCilinders;
    private int weightEngine;
    private String engineType;
    private String kppType;

    public Engine(int cilindersNumber,
                  int volumeCilinders,
                  int weightEngine,
                  String engineType,
                  String kppType) {
        this.cilindersNumber = cilindersNumber;
        this.volumeCilinders = volumeCilinders;
        this.weightEngine = weightEngine;
        this.engineType = engineType;
        this.kppType = kppType;
    }

    public int getCilindersNumber() {
        return cilindersNumber;
    }

    public void setCilindersNumber(int cilindersNumber) {
        this.cilindersNumber = cilindersNumber;
    }

    public int getVolumeCilinders() {
        return volumeCilinders;
    }

    public void setVolumeCilinders(int volumeCilinders) {
        this.volumeCilinders = volumeCilinders;
    }

    public int getWeightEngine() {
        return weightEngine;
    }

    public void setWeightEngine(int weightEngine) {
        this.weightEngine = weightEngine;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getKppType() {
        return kppType;
    }

    public void setKppType(String kppType) {
        this.kppType = kppType;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    @Override
    public String toString() {
        return "Engine{"
                + "cilindersNumber=" + cilindersNumber
                + ", volumeCilinders=" + volumeCilinders
                + ", weightEngine=" + weightEngine
                + ", engineType='" + engineType + '\''
                + ", kppType='" + kppType + '\''
                + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Engine clonedEngine = new Engine(this.getCilindersNumber(),
                this.getVolumeCilinders(),
                this.getWeightEngine(),
                this.getEngineType(),
                this.getKppType());
        return clonedEngine;
    }
}
