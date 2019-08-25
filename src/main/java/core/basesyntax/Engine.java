package core.basesyntax;


public class Engine implements Cloneable {

    private EngineType engineType;
    private int maxRpM;
    private String brand;
    private String model;
    private long dateIssue;

    public Engine(final EngineType engineType, final int maxRpM,
                  final String brand, final String model, final long dateIssue) {
        this.engineType = engineType;
        this.maxRpM = maxRpM;
        this.brand = brand;
        this.model = model;
        this.dateIssue = dateIssue;
    }

    public EngineType getEngineType() {
        return this.engineType;
    }

    public void setEngineType(final EngineType engineType) {
        this.engineType = engineType;
    }

    public int getMaxRpM() {
        return this.maxRpM;
    }

    public void setMaxRpM(final int maxRpM) {
        this.maxRpM = maxRpM;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public long getIssue() {
        return this.dateIssue;
    }

    public void setIssue(long dateIssue) {
        this.dateIssue = dateIssue;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // 'cause every field is primitive or immutable
    }

    static enum EngineType { HeatEngine, ElectricEngine, AirEngine }
}
