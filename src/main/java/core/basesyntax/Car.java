package core.basesyntax;

public class Car implements Cloneable {
    private static long vinCodeCounter = 0;
    private final long vinCode;
    private String mark;
    private String model;
    private String typeOfCarcase;
    private Engine engine;

    public Car(String mark, String model, String typeOfCarcase, Engine engine) {
        vinCode = vinCodeCounter++;
        this.mark = mark;
        this.model = model;
        this.typeOfCarcase = typeOfCarcase;
        this.engine = engine;
    }

    public long getVinCode() {
        return vinCode;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfCarcase() {
        return typeOfCarcase;
    }

    public void setTypeOfCarcase(String typeOfCarcase) {
        this.typeOfCarcase = typeOfCarcase;
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
                + "vinCode='" + vinCode + '\''
                + ", mark='" + mark + '\''
                + ", model='" + model + '\''
                + ", typeOfCarcase='" + typeOfCarcase + '\''
                + ", engine=" + engine
                + '}';
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        Engine clonedEngine = new Engine();
        clonedCar.setEngine(clonedEngine);
        return clonedCar;
    }
}
