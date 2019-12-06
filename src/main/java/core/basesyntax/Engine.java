package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String model;
    private String condition;
    private int power;
    private int volume;

    public Engine(String type, String model, String condition, int power, int volume) {
        this.type = type;
        this.model = model;
        this.condition = condition;
        this.power = power;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(type, model, condition, power, volume);
    }

}
