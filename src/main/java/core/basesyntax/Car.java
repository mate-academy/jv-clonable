package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private int year;
    private String type;
    private int summaryOfStiPlaces;
    private boolean isSportCar;
    private Engine engine;

    public Car(String model, int year, String type, int summaryOfStiPlaces,
               boolean isSportCar, Engine engine) {
        this.model = model;
        this.year = year;
        this.type = type;
        this.summaryOfStiPlaces = summaryOfStiPlaces;
        this.isSportCar = isSportCar;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSummaryOfStiPlaces() {
        return summaryOfStiPlaces;
    }

    public void setSummaryOfStiPlaces(int summaryOfStiPlaces) {
        this.summaryOfStiPlaces = summaryOfStiPlaces;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
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
                + ", year=" + year
                + ", type='" + type + '\''
                + ", summaryOfStiPlaces=" + summaryOfStiPlaces
                + ", isSportCar=" + isSportCar
                + ", engine=" + engine
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car cloneCar = (Car) super.clone();
            cloneCar.setEngine(engine.clone());
            return cloneCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't to create car clone", e);
        }
    }
}
