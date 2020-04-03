package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String model;
    private String type;
    private String maxPower;
    private String averagePower;

    public Engine(String name, String model, String type,
                  String maxPower, String averagePower) {
        this.name = name;
        this.model = model;
        this.type = type;
        this.maxPower = maxPower;
        this.averagePower = averagePower;
    }

    @Override
    public Engine clone() {
        return new Engine(name, model, type, maxPower, averagePower);
    }
}
