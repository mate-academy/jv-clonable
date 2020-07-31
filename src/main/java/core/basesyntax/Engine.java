package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private String modelName;
    private boolean electric;
    private int yearModel;
    private String type;

    public Engine(int power, String modelName, boolean electric, int yearModel, String type) {
        this.power = power;
        this.modelName = modelName;
        this.electric = electric;
        this.yearModel = yearModel;
        this.type = type;
    }

    public Engine(int power, String modelName) {
        this.power = power;
        this.modelName = modelName;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        power = power;
        modelName = modelName;
        electric = electric;
        yearModel = yearModel;
        type = type;
        return (Engine) new Engine(power, modelName, electric, yearModel, type);
    }
}
