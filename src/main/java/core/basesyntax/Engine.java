package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String type;
    private int power;
    private boolean isNew;
    private boolean isWorks;

    public Engine(String name, String type, int power, boolean isNew, boolean isWorks) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.isNew = isNew;
        this.isWorks = isWorks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public boolean isWorks() {
        return isWorks;
    }

    public void setWorks(boolean works) {
        isWorks = works;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "name='" + name + '\''
                + ", type='" + type + '\''
                + ", power=" + power
                + ", isNew=" + isNew
                + ", isWorks=" + isWorks
                + '}';
    }
}
