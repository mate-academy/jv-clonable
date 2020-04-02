package core.basesyntax;

public class Car implements Cloneable {
    private String modelCar;
    private int carSpeed;
    private String carColor;
    private int weight;
    private Engine engine;

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
