package core.basesyntax;

public class Engine implements Cloneable {
    private boolean works;
    private int cylinderCount;
    private int horsepower;
    private boolean isDirty;
    private String eats;

    public Engine(boolean works, int cylinderCount, int horsepower, boolean isDirty, String eats) {
        this.works = works;
        this.cylinderCount = cylinderCount;
        this.horsepower = horsepower;
        this.isDirty = isDirty;
        this.eats = eats;
    }

    public boolean isWorks() {
        return works;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public String getEats() {
        return eats;
    }

    public void setWorks(boolean works) {
        this.works = works;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    @Override
    public Engine clone() {
        try {
            Engine clonedEngine = (Engine) super.clone();
            return clonedEngine;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine object", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "works=" + works
                + ", cylinderCount=" + cylinderCount
                + ", horsepower=" + horsepower
                + ", isDirty=" + isDirty
                + ", eats='" + eats + '\''
                + '}';
    }
}
