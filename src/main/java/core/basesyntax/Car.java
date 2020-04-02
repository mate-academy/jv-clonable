package core.basesyntax;

public class Car implements Cloneable {
    private String modelCar;
    private int carSpeed;
    private String carColor;
    private int weight;
    private Engine engine;

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        Car newCar = new Car();
        Engine engineClone = engine.clone();
        newCar.setEngine(engineClone);
        return newCar;
    }
}
