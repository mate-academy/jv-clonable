package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private String kind;
    private int price;
    private Engine engine;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }

    public int getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car clone = (Car) super.clone();
        clone.engine = this.engine.clone();
        return clone;
    }
}
