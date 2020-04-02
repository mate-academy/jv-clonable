package core.basesyntax;

public class Engine implements Cloneable {
    private String typeOfFuel;
    private int power;
    private int volume;
    private int price;
    private boolean isNew;

    public Engine(String typeOfFuel, int power, int volume, int price, boolean isNew) {
        this.typeOfFuel = typeOfFuel;
        this.power = power;
        this.volume = volume;
        this.price = price;
        this.isNew = isNew;
    }

    public Engine clone(Engine other) throws CloneNotSupportedException {
        return new Engine(other.typeOfFuel,
                other.power, other.volume, other.price, other.isNew);
    }
}
