package core.basesyntax;

import java.util.Objects;

public class Engine implements Cloneable {
    private String markOfEngine;
    private String typeOfEngine;
    private String typeElectricOrGas;
    private double fueTank;
    private int maxPower;

    public Engine(String markOfEngine, String typeOfEngine, String typeElectricOrGas,
                  double fueTank, int maxPower) {
        this.markOfEngine = markOfEngine;
        this.typeOfEngine = typeOfEngine;
        this.typeElectricOrGas = typeElectricOrGas;
        this.fueTank = fueTank;
        this.maxPower = maxPower;
    }

    public Engine() {
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

    public String getTypeElectricOrGas() {
        return typeElectricOrGas;
    }

    public void setTypeElectricOrGas(String typeElectricOrGas) {
        this.typeElectricOrGas = typeElectricOrGas;
    }

    public double getFueTank() {
        return fueTank;
    }

    public void setFueTank(double fueTank) {
        this.fueTank = fueTank;
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
                + ", typeElectricOrGas='" + typeElectricOrGas
                + '\''
                + ", volume="
                + fueTank
                + ", speed="
                + maxPower
                + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(markOfEngine, typeOfEngine, typeElectricOrGas, fueTank, maxPower);
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(markOfEngine, typeOfEngine, typeElectricOrGas, fueTank, maxPower);
    }
}
