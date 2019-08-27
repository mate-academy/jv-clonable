package core.basesyntax;

public class Car implements Cloneable {

    private String carLabel;
    private String carType;
    private int height;
    private int width;
    private int length;
    private Engine engine;

    public Car(String carLabel, String carType, int height, int width, int length, Engine engine) {
        this.carLabel = carLabel;
        this.carType = carType;
        this.height = height;
        this.width = width;
        this.length = length;
        this.engine = engine;
    }

    public Car() {

    }

    public void setCarLabel(String carLabel) {
        this.carLabel = carLabel;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Engine engine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car clone = new Car(this.carLabel, this.carType, this.height,
                this.width, this.length, this.engine);
        return clone;

    }
}