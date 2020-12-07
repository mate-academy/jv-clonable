package core.basesyntax;

public class Engine implements Cloneable {
    private String maker;
    private String model;
    private String type;
    private int volume;
    private int horsePower;

    public Engine(String maker, String model, String type, int volume, int horsePower) {
        this.maker = maker;
        this.model = model;
        this.type = type;
        this.volume = volume;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "maker='" + maker + '\''
                + ", model='" + model + '\''
                + ", type='" + type + '\''
                + ", volume=" + volume
                + ", horsePower=" + horsePower
                + '}';
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can not create engine clone", e);
        }
    }
}
