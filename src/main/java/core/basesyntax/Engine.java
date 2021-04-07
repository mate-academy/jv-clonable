package core.basesyntax;

public class Engine implements Cloneable {
    private String manufacturer;
    private String model;
    private int power;
    private int age;
    private int price;

    public Engine(String manufacturer, String model, int power, int age, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
        this.age = age;
        this.price = price;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Car clone", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{" + "manufacturer='" + manufacturer + '\''
                + ", model='" + model + '\''
                + ", power=" + power
                + ", age=" + age
                + ", price=" + price
                + '}';
    }
}
