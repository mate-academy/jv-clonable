package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private int year;
    private int mileAge;
    private double speed;
    private Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "name='" + name + '\''
                + ", year=" + year
                + ", mileAge=" + mileAge
                + ", speed=" + speed
                + ", engine=" + engine
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car cloneAudi = (Car) super.clone();
            cloneAudi.setEngine(engine.clone());
            return cloneAudi;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }
}
