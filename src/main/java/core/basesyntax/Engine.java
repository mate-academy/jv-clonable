package core.basesyntax;

public class Engine implements Cloneable {
    private String capacity;
    private String mark;
    private String power;
    private String type;
    private boolean isRun;

    public Engine(String capacity, String mark, String power, String type, boolean isRun) {
        this.capacity = capacity;
        this.mark = mark;
        this.power = power;
        this.type = type;
        this.isRun = isRun;
    }

    @Override
    protected Engine clone() {
        return new Engine(capacity, mark, power, type, isRun);
    }
}

