package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private String kind;
    private int price;
    private Engine engine;

    public Car(String name, String color, String kind, int price, Engine engine) {
        this.name = name;
        this.color = color;
        this.kind = kind;
        this.price = price;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    protected Car clone() {
        return new Car(name, color, kind, price, engine.clone());
    }
}
