package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String manufacturer;
    private String model;
    private String color;
    private int age;
    private int price;

    public Car(Engine engine, String manufacturer, String model, String color, int age, int price) {
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.age = age;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Car{" + "engine=" + engine
                + ", manufacturer='" + manufacturer + '\''
                + ", model='" + model + '\''
                + ", color='" + color + '\''
                + ", age=" + age
                + ", price=" + price
                + '}';
    }
}
