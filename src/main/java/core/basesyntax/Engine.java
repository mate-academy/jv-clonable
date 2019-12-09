package core.basesyntax;

public class Engine implements Cloneable {
    private boolean oilEngine;
    private int weight;
    private int width;
    private int length;
    private String label;

    private Engine(boolean oilEngine, int weight, int width, int length, String label) {
        this.oilEngine = oilEngine;
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.label = label;
    }

    public void setOilEngine(boolean oilEngine) {
        this.oilEngine = oilEngine;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public Engine clone() {
        return new Engine(oilEngine, weight, width, length, label);
    }
}
