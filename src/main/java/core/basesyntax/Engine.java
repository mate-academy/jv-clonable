package core.basesyntax;

public class Engine implements Cloneable {
    private int number;
    private int horsePower;
    private int volume;
    private String manufacturer;
    private String type;

    public Engine(int number, int horsePower, int volume, String manufacturer, String type) {
        this.number = number;
        this.horsePower = horsePower;
        this.volume = volume;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "number=" + number
                + ", horsePower=" + horsePower
                + ", volume=" + volume
                + ", manufacturer='" + manufacturer + '\''
                + ", type='" + type + '\''
                + '}';
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        super.clone();
        Engine engine = new Engine(1215, 300, 2, "Honda", "petrol");
        return engine;
    }
}
