package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private String modelName;
    private boolean electric;
    private int yearModel;
    private String type;

    private Engine(int power, String modelName, boolean electric, int yearModel, String type) {
        this.power = power;
        this.modelName = modelName;
        this.electric = electric;
        this.yearModel = yearModel;
        this.type = type;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        clone().power = power;
        clone().modelName = modelName;
        clone().electric = electric;
        clone().yearModel = yearModel;
        clone().type = type;
        return clone();
    }
}
