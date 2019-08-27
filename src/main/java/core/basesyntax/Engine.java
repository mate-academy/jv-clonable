package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private Integer id;
    private Integer volume;
    private String type;
    private Integer numberOfCylinders;

    public Engine(String name, Integer id, Integer volume, String type,
                  Integer numberOfCylinders) {
        this.name = name;
        this.id = id;
        this.volume = volume;
        this.type = type;
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(this.name, this.id, this.volume, this.type, this.numberOfCylinders);
    }
}
