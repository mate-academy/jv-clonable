package core.basesyntax;

public class Car implements Cloneable {
    private String producer;
    private String model;
    private String color;
    private int productionYear;
    private Engine engine;

    public Car(String producerName, String modelName, String colorName,
               int year, Engine carEngine) {
        producer = producerName;
        model = modelName;
        color = colorName;
        productionYear = year;
        engine = carEngine;
    }

    public Car clone() {
        return new Car(producer, model, color, productionYear, engine);
    }
}
