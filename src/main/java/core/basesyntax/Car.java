package core.basesyntax;

public class Car implements Cloneable {
    private String carName;
    private String carModel;
    private String carBody;
    private int fourOrTwoDoors;
    private Engine engine;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public int getFourOrTwoDoors() {
        return fourOrTwoDoors;
    }

    public void setFourOrTwoDoors(int fourOrTwoDoors) {
        this.fourOrTwoDoors = fourOrTwoDoors;
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
                + "carName='" + carName + '\''
                + ", carModel='" + carModel + '\''
                + ", carBody='" + carBody + '\''
                + ", fourOrTwoDoors=" + fourOrTwoDoors
                + ", engine=" + engine
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone object", e);
        }
    }
}
