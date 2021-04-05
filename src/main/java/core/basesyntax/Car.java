package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private String color;
    private String vinCode;
    private boolean hasBuiltInGps;
    private int mileage;

    public Car(Engine engine, String model, String color,
               String vinCode, boolean hasBuiltInGps, int mileage) {
        this.engine = engine;
        this.model = model;
        this.color = color;
        this.vinCode = vinCode;
        this.hasBuiltInGps = hasBuiltInGps;
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public boolean isHasBuiltInGps() {
        return hasBuiltInGps;
    }

    public void setHasBuiltInGps(boolean hasBuiltInGps) {
        this.hasBuiltInGps = hasBuiltInGps;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{"
                + "engine=" + engine
                + ", model='" + model + '\''
                + ", color='" + color + '\''
                + ", vinCode='" + vinCode + '\''
                + ", hasBuiltInGps= " + (hasBuiltInGps ? "Yes" : "No")
                + ", mileage=" + mileage + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setColor(this.color);
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone car", e);
        }
    }
}
