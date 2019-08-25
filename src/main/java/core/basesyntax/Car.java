package core.basesyntax;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int dateOfIssue;
    private int maxSpeed;
    private Engine engine;

    public Car(String model, String color, int date, int maxSpeed, Engine engine1) {
        this.model = model;
        this.color = color;
        this.dateOfIssue = date;
        this.maxSpeed = maxSpeed;
        this.engine = engine1;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.engine = engine.clone();
        return car;
    }

}
