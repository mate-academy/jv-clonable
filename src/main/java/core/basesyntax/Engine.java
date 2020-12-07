package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private int year;
    private int weight;
    private String madeBy;
    private boolean turbo;

    public Engine(double volume, int year, int weight, String madeBy, boolean turbo) {
        this.volume = volume;
        this.year = year;
        this. weight = weight;
        this.madeBy = madeBy;
        this.turbo = turbo;
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
        StringBuilder stringBuilder = new StringBuilder("Engine:\\Vol: ");
        stringBuilder.append(volume).append("\\Year: ").append(year).append("\\Weight: ")
                .append(weight).append("\\Made BY: ").append(madeBy)
                .append("\\Has turbo: ").append(turbo);
        return stringBuilder.toString();
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

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
