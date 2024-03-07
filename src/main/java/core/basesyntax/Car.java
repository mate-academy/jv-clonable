package core.basesyntax;

public class Car implements Cloneable {
    private String id;
    private String model;
    private int price;
    private String color;
    private Engine engine;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            Car carClone = (Car) super.clone();
            carClone.setEngine(engine.clone());
            return carClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can not clone car.", e);
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "id='" + id + '\'' + ", model='" + model + '\'' + ", price=" + price
                + ", color='" + color + '\'' + ", engine=" + engine + '}';
    }
}
