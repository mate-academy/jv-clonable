package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private int year;
    private double volume;
    private String madeFrom;
    private String mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "name='" + name + '\''
                + ", year=" + year
                + ", volume=" + volume
                + ", madeFrom='" + madeFrom + '\''
                + ", mark='" + mark + '\''
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone name", e);
        }
    }
}
