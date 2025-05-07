package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private int year;
    private int weight;
    private String madeBy;
    private boolean isTurbo;

    public Engine(double volume, int year, int weight, String madeBy, boolean isTurbo) {
        this.volume = volume;
        this.year = year;
        this.weight = weight;
        this.madeBy = madeBy;
        this.isTurbo = isTurbo;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Engine can't be cloned", e);
        }
    }

    public String toString() {
        return "Engine:\\Vol: " + volume + "\\Year: " + year
                + "\\Weight: " + weight + "\\Made BY: "
                + madeBy + "\\Has turbo: " + isTurbo;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public void setTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
    }

    public double getVolume() {
        return volume;
    }

    public int getYear() {
        return year;
    }

    public int getWeight() {
        return weight;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public boolean isTurbo() {
        return isTurbo;
    }
}
