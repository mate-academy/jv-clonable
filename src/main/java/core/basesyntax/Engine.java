package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private Integer id;
    private Integer volume;
    private String type;
    private Integer numberOfCylinders;

    public Engine() {
        this.name = "hybrid";
        this.id = 10;
        this.volume = 2500;
        this.type = "electric/gas";
        this.numberOfCylinders = 6;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return (Engine)super.clone();
    }
}
