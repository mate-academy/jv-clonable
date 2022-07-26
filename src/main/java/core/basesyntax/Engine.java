package core.basesyntax;

public class Engine implements Cloneable {
    private int horsePower;
    private long serialNumber;
    private String model;
    private String type;
    private double effiency;

    public Engine(int horsePower, long serialNumber, String model, String type, double effiency) {
        this.horsePower = horsePower;
        this.serialNumber = serialNumber;
        this.model = model;
        this.type = type;
        this.effiency = effiency;
    }

    @Override
    public Engine clone() {
        return new Engine(horsePower, serialNumber, model, type, effiency);
    }

    @Override
    public String toString() {
        return "Engine{"
                + "horsePower=" + horsePower
                + ", serialNumber=" + serialNumber
                + ", model='" + model + '\''
                + ", type='" + type + '\''
                + ", effiency=" + effiency
                + '}';
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEffiency(double effiency) {
        this.effiency = effiency;
    }
}
