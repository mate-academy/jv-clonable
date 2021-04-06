package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String transmission;
    private int doorsCount;
    private int year;
    private Engine engine;

    public Car(String model, String transmission, int doorsCount, int year, Engine engine) {
        this.model = model;
        this.transmission = transmission;
        this.doorsCount = doorsCount;
        this.year = year;
        this.engine = engine;
    }

    @Override
    protected Car clone() {
        Car clonedCar;
        try {
            clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create clone!", e);
        }
        return clonedCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
                + "model='" + model + '\''
                + ", transmission='" + transmission + '\''
                + ", doorsCount=" + doorsCount
                + ", year=" + year
                + ", engine=" + engine
                + '}';
    }
}
