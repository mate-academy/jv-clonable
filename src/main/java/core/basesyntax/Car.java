package core.basesyntax;

public class Car implements Cloneable {
    private int mileage;
    private long serialNum;
    private String vendorName;
    private String model;
    private Engine engine;

    public Car(int mileage, long serialNum, String vendorName, String model, Engine engine) {
        this.mileage = mileage;
        this.model = model;
        this.serialNum = serialNum;
        this.vendorName = vendorName;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(mileage, serialNum, vendorName, model, engine.clone());
    }
}
