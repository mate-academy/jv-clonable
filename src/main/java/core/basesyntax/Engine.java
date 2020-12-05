package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int horsePower;
    private double field3;
    private boolean field4;
    private byte field5;

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

    public double getField3() {
        return field3;
    }

    public void setField3(double field3) {
        this.field3 = field3;
    }

    public boolean isField4() {
        return field4;
    }

    public void setField4(boolean field4) {
        this.field4 = field4;
    }

    public byte getField5() {
        return field5;
    }

    public void setField5(byte field5) {
        this.field5 = field5;
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
                + ", engineField3=" + field3 + ", engineField4="
                + field4 + ", engineField5=" + field5 + "}";
    }
}
