package core.basesyntax;

public class Car implements Cloneable {
    private String modelCar;
    private int carSpeed;
    private String carColor;
    private int weight;
    private Engine engine;

    public Car(String modelCar, int carSpeed, String carColor, int weight, Engine engine) {
        this.modelCar = modelCar;
        this.carSpeed = carSpeed;
        this.carColor = carColor;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(modelCar, carSpeed, carColor, weight, engine.clone());
    }
}
