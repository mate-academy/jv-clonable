package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String color;
    private int capacity;
    private boolean isDiesel;
    private String engineType;

    public Engine(String type, String color, int capacity, boolean isDiesel, String engineType) {
        this.type = type;
        this.color = color;
        this.capacity = capacity;
        this.isDiesel = isDiesel;
        this.engineType = engineType;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(type, color, capacity, isDiesel, engineType);
    }
}
