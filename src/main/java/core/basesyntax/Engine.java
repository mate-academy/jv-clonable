package core.basesyntax;

public class Engine implements Cloneable {
    private int width;
    private int length;
    private int horsePower;
    private String type;
    private boolean isBroken;

    public Engine(int width, int length, int horsePower, String type, boolean isBroken) {
        this.width = width;
        this.length = length;
        this.horsePower = horsePower;
        this.type = type;
        this.isBroken = isBroken;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(width, length, horsePower, type, isBroken);
    }

    @Override
    public String toString() {
        return "Engine{"
                + "width=" + width
                + ", length=" + length
                + ", horsePower=" + horsePower
                + ", type='" + type + '\''
                + ", isBroken=" + isBroken
                + '}';
    }
}
