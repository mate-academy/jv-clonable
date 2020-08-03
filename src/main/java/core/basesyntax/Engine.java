package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String model;
    private int year;
    private int id;
    private boolean isNew;

    public Engine(String name, String model, int year, int id, boolean isNew) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.id = id;
        this.isNew = isNew;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
