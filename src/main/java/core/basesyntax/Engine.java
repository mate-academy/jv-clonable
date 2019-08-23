package core.basesyntax;

public class Engine implements Cloneable {
    private String modelEngine;
    private String type;
    private int enginePower;
    private int costEngine;
    private double engineCapacity;

    public Engine(String modelEngine, String type,
                  int enginePower, int costEngine, double engineCapacity) {
        this.modelEngine = modelEngine;
        this.type = type;
        this.enginePower = enginePower;
        this.costEngine = costEngine;
        this.engineCapacity = engineCapacity;
    }

    public String getModelEngine() {
        return modelEngine;
    }

    public void setModelEngine(String modelEngine) {
        this.modelEngine = modelEngine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getCostEngine() {
        return costEngine;
    }

    public void setCostEngine(int costEngine) {
        this.costEngine = costEngine;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(modelEngine, type,enginePower,costEngine,engineCapacity);
    }
}
