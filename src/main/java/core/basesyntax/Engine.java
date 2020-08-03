package core.basesyntax;

public class Engine implements Cloneable {
    private String markOfEngine;
    private String typeOfEngine;
    private String type;
    private double fuelTank;
    private int maxPower;

    public Engine(String markOfEngine, String typeOfEngine, String type,
                  double fuelTank, int maxPower) {
        this.markOfEngine = markOfEngine;
        this.typeOfEngine = typeOfEngine;
        this.type = type;
        this.fuelTank = fuelTank;
        this.maxPower = maxPower;
    }

    public String getMarkOfEngine() {
        return markOfEngine;
    }

    public void setMarkOfEngine(String markOfEngine) {
        this.markOfEngine = markOfEngine;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + markOfEngine
                + '\''
                + ", power='" + typeOfEngine
                + '\''
                + ", typeElectricOrGas='" + type
                + '\''
                + ", volume="
                + fuelTank
                + ", speed="
                + maxPower
                + '}';
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(markOfEngine, typeOfEngine, type, fuelTank, maxPower);
    }
}
