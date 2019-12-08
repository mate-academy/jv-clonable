package core.basesyntax;

public class Engine implements Cloneable {
    private int numberOfCilinders;
    private int numberOfValves;
    private String model;
    private Boolean isWork;
    private int mileage;

    public Engine(int numberOfCilinders,
                  int numberOfValves,
                  String model,
                  Boolean isWork,
                  int mileage) {
        this.numberOfCilinders = numberOfCilinders;
        this.numberOfValves = numberOfValves;
        this.model = model;
        this.isWork = isWork;
        this.mileage = mileage;
    }

    public int getNumberOfCilinders() {
        return numberOfCilinders;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String getModel() {
        return model;
    }

    public Boolean getWork() {
        return isWork;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public Object clone() {
        try {
            return Engine.super.clone();
        } catch (CloneNotSupportedException e) {
            return new Engine(this.numberOfCilinders,
                    this.numberOfValves,
                    this.model,
                    this.isWork,
                    this.mileage);
        }
    }
}
