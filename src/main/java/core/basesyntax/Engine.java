package core.basesyntax;

public class Engine implements Cloneable {

    private int volume;
    private String type;
    private boolean turbo;
    private int amountTurnines;
    private String location;

    public Engine(int volume, String type, boolean turbo, int amountTurnines, String location) {
        this.volume = volume;
        this.type = type;
        this.turbo = turbo;
        this.amountTurnines = amountTurnines;
        this.location = location;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(volume, type, turbo, amountTurnines, location);
    }
}
