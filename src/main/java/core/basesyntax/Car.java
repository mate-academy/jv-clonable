package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String producer;
    private String color;
    private int yearOfProduction;
    private Engine engine;

    public Car(String model, String producer, String color, int yearOfProduction, Engine engine) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\''
                + ", producer='" + producer + '\''
                + ", color='" + color + '\''
                + ", yearOfProduction'"
                + yearOfProduction + '\'' + ", engine='"
                + engine + '}';
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car)super.clone();
            clonedCar.setEngine((Engine)engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone object", e);
        }
    }
}
