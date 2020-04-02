package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String size;
    private int volume;
    private String colour;
    private int price;

    public Engine(String name, String size, int volume, String colour, int price) {
        this.name = name;
        this.size = size;
        this.volume = volume;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(name, size, volume, colour, price);
    }
}
