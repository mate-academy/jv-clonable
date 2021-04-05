package core.basesyntax;

public class Car implements Cloneable {
    private int ageModel;
    private int price;
    private String color;
    private String model;
    private Engine engine;

    public int getAge() {
        return ageModel;
    }

    public void setAgeModel(int age) {
        this.ageModel = age;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "ageModel=" + ageModel
                + ", price=" + price
                + ", color='" + color + '\''
                + ", model='" + model + '\''
                + ", engine=" + engine
                + '}';
    }

    @Override
    public Car clone() {
        try {
            Car cloneCar = (Car) super.clone();
            cloneCar.setEngine(engine.clone());
            return cloneCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't do clone", e);
        }
    }
}
