package core.basesyntax;

public class Car implements Cloneable {
    private String modelName;
    private String color;
    private Engine engine;
    private String type;
    private int numbersOfPassengers;

    public Car(String modelName, String color, Engine engine,
               String type, int numbersOfPassengers) {
        this.modelName = modelName;
        this.color = color;
        this.engine = engine;
        this.type = type;
        this.numbersOfPassengers = numbersOfPassengers;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(modelName, color, engine.clone(), type, numbersOfPassengers);
    }
}
