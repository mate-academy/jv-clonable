package core.basesyntax;

public class Engine implements Cloneable {
    private int horsePower;
    private int maxLoad;
    private int standartLoad;
    private String maker;
    private String model;

    public Engine(int horsePower, int maxLoad, int standartLoad, String maker, String model) {
        this.horsePower = horsePower;
        this.maxLoad = maxLoad;
        this.standartLoad = standartLoad;
        this.maker = maker;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "horsePower=" + horsePower
                + ", maxLoad=" + maxLoad
                + ", standartLoad=" + standartLoad
                + ", maker='" + maker + '\''
                + ", model='" + model + '\''
                + '}';
    }
}
