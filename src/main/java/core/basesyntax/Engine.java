package core.basesyntax;

public class Engine implements Cloneable {
    private double volume;
    private double mileage;
    private boolean started;
    private double usingFuel;
    private int maxSpeed;

    public Engine(double volume, double mileage, boolean started, double usingFuel, int maxSpeed) {
        this.volume = volume;
        this.mileage = mileage;
        this.started = started;
        this.usingFuel = usingFuel;
        this.maxSpeed = maxSpeed;
    }

    public Engine(double mileage, double volume) {
        this.mileage = mileage;
        this.volume = volume;
        usingFuel = volume * 5;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public double getUsingFuel() {
        return usingFuel;
    }

    public void addMileage(double mileage) {
        if (started) {
            this.mileage += mileage;
        }
    }

    public void turnOn() {
        started = true;

    }

    public void turnOff() {
        started = false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}