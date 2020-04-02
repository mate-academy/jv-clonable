package core.basesyntax;

public class Engine implements Cloneable {
    private int horsePower;
    private String name;
    private String type;
    private int speed;
    private boolean isWorking;

    public Engine(int horsePower, String name, String type, int speed, boolean isWorking) {
        this.horsePower = horsePower;
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.isWorking = isWorking;
    }

    @Override
    public Engine clone() {
        return new Engine(horsePower, name, type, speed, isWorking);
    }
}
