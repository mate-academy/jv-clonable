package core.basesyntax;

import java.util.Arrays;

public class Engine implements Cloneable {
    private String name;
    private String[] functions;
    private int coast;
    private int issueYear;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFunctions() {
        return functions;
    }

    public void setFunctions(String[] functions) {
        this.functions = functions;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "name='" + name + '\''
                + ", functions=" + Arrays.toString(functions)
                + ", coast=" + coast
                + ", issueYear=" + issueYear
                + ", speed=" + speed
                + '}';
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine", e);
        }
    }
}
