package core.basesyntax;

public class Engine implements Cloneable {
    private int capacity;
    private int valveNumber;
    private int cylinderNumber;
    private String manufacturer;
    private String type;

    public Engine(int capacity, int valveNumber, int cylinderNumber,
                  String manufacturer, String type) {
        this.capacity = capacity;
        this.valveNumber = valveNumber;
        this.cylinderNumber = cylinderNumber;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(capacity, valveNumber, cylinderNumber, manufacturer, type);
    }
}
