package core.basesyntax;

public class Car implements Cloneable {
    private Engine engineOfCar;
    private String mark;
    private int maxSpeed;
    private String color;
    private int weight;

    public String getMark() {
        return mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Engine getEngineOfCar() {
        return engineOfCar;
    }

    public void setEngineOfCar(Engine engineOfCar) {
        this.engineOfCar = engineOfCar;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    protected Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngineOfCar(engineOfCar.clone());
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "engineOfCar=" + engineOfCar + ", mark='" + mark + '\''
                + ", maxSpeed=" + maxSpeed + ", color='" + color + '\''
                + ", weight=" + weight + '}';
    }
}
