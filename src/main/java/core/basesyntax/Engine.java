package core.basesyntax;

public class Engine implements Cloneable {
    private double engineVolume;
    private boolean isDiesel;
    private boolean isRotary;
    private int numberOfCylinders;
    private int yearProduce;

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    public void setRotary(boolean rotary) {
        isRotary = rotary;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setYearProduce(int yearProduce) {
        this.yearProduce = yearProduce;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "engineVolume=" + engineVolume + ", isDiesel=" + isDiesel
                + ", isRotary=" + isRotary + ", numberOfCylinders=" + numberOfCylinders
                + ", yearProduce=" + yearProduce + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone name ", e);
        }
    }
}
