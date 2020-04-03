package core.basesyntax;

public class Car implements Cloneable {
    private String mark;
    private String model;
    private String typeOfBody;
    private int maxSpeed;
    private Engine engine;

    public Car(String mark, String model, String typeOfBody, int maxSpeed, Engine engine) {
        this.mark = mark;
        this.model = model;
        this.typeOfBody = typeOfBody;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public Car(Car otherCar) throws CloneNotSupportedException {
        this(new String(otherCar.getMark()),
                new String(otherCar.getModel()),
                new String(otherCar.getTypeOfBody()),
                otherCar.getMaxSpeed(),
                new Engine(otherCar.getEngine()));
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
