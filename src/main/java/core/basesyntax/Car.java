package core.basesyntax;

public class Car implements Cloneable {
    private String color;
    private String model;
    private int yearOfIssue;
    private int price;
    private boolean isNew;
    private Engine engine;

    public Car(String color, String model, int yearOfIssue,
               int price, boolean isNew, Engine engine) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
        this.isNew = isNew;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngine(engine.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone car", e);
        }
    }

    @Override
    public String toString() {
        return "Car parameters -> " + engine + Engine.getLineBreak()
                + "Back to car parameters -> "
                + "model: " + model + " Color: " + color + Engine.getLineBreak()
                + " Year of issue: " + yearOfIssue + Engine.getLineBreak()
                + " Condition(new?): " + isNew + Engine.getLineBreak()
                + " Price: " + price + Engine.getLineBreak();
    }
}
