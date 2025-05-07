package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String gasOrDieselType;
    private int countOfCylinders;
    private int volume;
    private boolean isDefective;

    public Engine(String model, String gasOrDieselType, int countOfCylinders,
                  int volume, boolean isDefective) {
        this.model = model;
        this.gasOrDieselType = gasOrDieselType;
        this.countOfCylinders = countOfCylinders;
        this.volume = volume;
        this.isDefective = isDefective;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGasOrDieselType() {
        return gasOrDieselType;
    }

    public void setGasOrDieselType(String gasOrDieselType) {
        this.gasOrDieselType = gasOrDieselType;
    }

    public int getCountOfCylinders() {
        return countOfCylinders;
    }

    public void setCountOfCylinders(int countOfCylinders) {
        this.countOfCylinders = countOfCylinders;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isDefective() {
        return isDefective;
    }

    public void setDefective(boolean defective) {
        isDefective = defective;
    }

    @Override
    public Engine clone() {
        return new Engine(model, gasOrDieselType, countOfCylinders, volume, isDefective);
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + model + '\''
                + ", gasOrDieselType='" + gasOrDieselType + '\''
                + ", countOfCylinders=" + countOfCylinders
                + ", volume=" + volume
                + ", isDefective=" + isDefective
                + '}';
    }
}
