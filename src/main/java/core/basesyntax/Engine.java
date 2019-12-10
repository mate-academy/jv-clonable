package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int countOfCylinder;
    private int countOfValve;
    private int power;
    private boolean isElectric;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCountOfCylinder() {
        return countOfCylinder;
    }

    public void setCountOfCylinder(int countOfCylinder) {
        this.countOfCylinder = countOfCylinder;
    }

    public int getCountOfValve() {
        return countOfValve;
    }

    public void setCountOfValve(int countOfValve) {
        this.countOfValve = countOfValve;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        this.isElectric = electric;
    }

    public Engine(String type, int countOfCylinder, int countOfValve,
                  int power, boolean isElectric) {
        this.type = type;
        this.countOfCylinder = countOfCylinder;
        this.countOfValve = countOfValve;
        this.power = power;
        this.isElectric = isElectric;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        Engine clone = (Engine) super.clone();
        clone.type = type;
        clone.countOfCylinder = countOfCylinder;
        clone.countOfValve = countOfValve;
        clone.isElectric = isElectric;
        return clone;
    }
}
