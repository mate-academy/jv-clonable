package core.basesyntax;

public class Engine implements Cloneable {
    private int serialNumber;
    private int cylinderNumber;
    private int roundsPerMinute;
    private String model;
    private String tradeMark;

    public Engine(int serialNumber, int cylinderNumber,
                  int roundsPerMinute, String model, String tradeMark) {
        this.serialNumber = serialNumber;
        this.cylinderNumber = cylinderNumber;
        this.roundsPerMinute = roundsPerMinute;
        this.model = model;
        this.tradeMark = tradeMark;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Engine(serialNumber, cylinderNumber, roundsPerMinute, model, tradeMark);
    }
}
