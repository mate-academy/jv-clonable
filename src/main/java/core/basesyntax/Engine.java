package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String producer;
    private String model;
    private int voltage;
    private int power;

    public Engine(String typeName, String producerName, String modelName,
                  int voltageValue, int powerValue) {
        type = typeName;
        producer = producerName;
        model = modelName;
        voltage = voltageValue;
        power = powerValue;
    }

    public Engine clone() {
        return new Engine(type, producer, model, voltage, power);
    }
}
