package core.basesyntax;

public class Engine implements Cloneable {
    private boolean isOn;
    private float size;
    private String type;
    private String model;
    private String dateOfCreation;

    Engine(boolean isOn, float size, String type, String model, String dateOfCreation) {
        this.isOn = isOn;
        this.size = size;
        this.type = type;
        this.model = model;
        this.dateOfCreation = dateOfCreation;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public Engine clone() {
        return new Engine(isOn, size, type, model, dateOfCreation);
    }
}
