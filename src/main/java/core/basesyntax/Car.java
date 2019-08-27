package core.basesyntax;

public class Car implements Cloneable {

    private String name;
    private Engine engine;
    private double fuel;
    private double usedFuel;
    private String color;

    public Car(String name, double usedFuel, double fuel, String color, Engine engine) {
        this.name = name;
        this.engine = engine;
        this.fuel = fuel;
        this.color = color;
        this.usedFuel = usedFuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getFuel() {
        return fuel;
    }

    public double getUsedFuel() {
        return usedFuel;
    }

    public double getVolumeEngine() {
        return engine.getVolume();
    }

    public double getMileage() {
        return engine.getMileage();
    }

    public double getUsingFuel() {
        return engine.getUsingFuel();
    }

    public double leftFuel() {
        return (fuel - usedFuel);
    }

    public void turnOn() {
        engine.turnOn();
    }

    public void turnOff() {
        engine.turnOff();
    }

    public void start(int speed, double hours) {
        if (!engine.isStarted() || getFuel() == 0 || speed > engine.getMaxSpeed()) {
            return;
        }
        double distance = speed * hours;
        engine.addMileage(distance);
        usedFuel += distance / 100 * engine.getUsingFuel();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(name, usedFuel, fuel, color, (Engine) engine.clone());
    }

}