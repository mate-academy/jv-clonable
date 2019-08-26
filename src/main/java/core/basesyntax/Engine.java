package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int power;
    private int compression;
    private int volume;
    private int quantityOfPistols;

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    public Engine(String model, int power, int compression, int volume, int quantityOfPistols) {
        this.model = model;
        this.power = power;
        this.compression = compression;
        this.volume = volume;
        this.quantityOfPistols = quantityOfPistols;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCompression() {
        return compression;
    }

    public void setCompression(int compression) {
        this.compression = compression;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuantatyOfPistols() {
        return quantityOfPistols;
    }

    public void setQuantatyOfPistols(int quantityOfPistols) {
        this.quantityOfPistols = quantityOfPistols;
    }
}
