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

    public void setEats(String eats) {
        this.eats = eats;
    }

    @Override
    public Engine clone() {
        try {
            Engine clonedEngine = (Engine) super.clone();
            clonedEngine.setEats(eats);
            return clonedEngine;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No clones here!", e);
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
