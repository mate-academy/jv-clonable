package core.basesyntax;

/**
 * Дано класс Car и класс Engine. Определите метод клон так чтобы клонирование было глубоким.
 * Добавьте минимум 5 полей в каждый класс (Car and Engine).
 * Не забудьте использовать двигатель в автомобиле.
 */
public class Car implements Cloneable {
    private String nameCar;
    private String modelCar;
    private int maxSpedCar;
    private int ageCar;
    private int weightCar;
    private Engine engine;

    public Car(String nameCar, String modelCar, int maxSpedCar, int ageCar,
               int weightCar, Engine engine) {
        this.nameCar = nameCar;
        this.modelCar = modelCar;
        this.maxSpedCar = maxSpedCar;
        this.ageCar = ageCar;
        this.weightCar = weightCar;
        this.engine = engine;
    }

    public Car clone() {
        return new Car(nameCar, modelCar, maxSpedCar, ageCar, weightCar, engine);
    }

    public String getNameCar() {
        return nameCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public int getMaxSpedCar() {
        return maxSpedCar;
    }

    public int getAgeCar() {
        return ageCar;
    }

    public int getWeightCar() {
        return weightCar;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "nameCar='" + nameCar + '\''
                + ", modelCar='" + modelCar + '\''
                + ", maxSpedCar=" + maxSpedCar
                + ", ageCar=" + ageCar
                + ", weightCar=" + weightCar
                + ", engine=" + engine
                + '}';
    }
}
