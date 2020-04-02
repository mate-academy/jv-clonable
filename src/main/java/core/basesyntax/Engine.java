package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private int volume;
    private String model;
    private String typeOfFuel;
    private int diameter;

    public Engine(int power, int volume, String model, String typeOfFuel, int diameter) {
        this.power = power;
        this.volume = volume;
        this.model = model;
        this.typeOfFuel = typeOfFuel;
        this.diameter = diameter;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Engine cloned = (Engine) super.clone();
        return cloned;
    }
}
