package core.basesyntax;

public class Engine implements Cloneable {
    private String modelName;
    private String type;
    private int volume;
    private int power;
    private int weight;

    public Engine(String modelName, String type, int volume, int power, int weight) {
        this.modelName = modelName;
        this.type = type;
        this.volume = volume;
        this.power = power;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
