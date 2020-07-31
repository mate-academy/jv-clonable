package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int numberOfCylinders;
    private int power;
    private String fuel;
    private boolean isTurbocharger;

    public Engine(String type, int numberOfCylinders,
                  int power, String fuel, boolean isTurbocharger) {
        this.type = type;
        this.numberOfCylinders = numberOfCylinders;
        this.power = power;
        this.fuel = fuel;
        this.isTurbocharger = isTurbocharger;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isTurbocharger() {
        return isTurbocharger;
    }

    public void setTurbocharger(boolean turbocharger) {
        isTurbocharger = turbocharger;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
