package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int horsePower;
    private double oilConsumption;
    private boolean isAvailable;
    private byte quantityOfWires;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getOilConsumption() {
        return oilConsumption;
    }

    public void setOilConsumption(double oilConsumption) {
        this.oilConsumption = oilConsumption;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public byte getQuantityOfWires() {
        return quantityOfWires;
    }

    public void setQuantityOfWires(byte quantityOfWires) {
        this.quantityOfWires = quantityOfWires;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(
                    "ERROR: error occurred in 'Engine' class - clone() method", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{" + " model=" + model + ", horsePower=" + horsePower
                + ", engineField3=" + oilConsumption + ", engineField4="
                + isAvailable + ", engineField5=" + quantityOfWires + "}";
    }
}
