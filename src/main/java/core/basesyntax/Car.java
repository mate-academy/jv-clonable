package core.basesyntax;

public class Car implements Cloneable {
    private int speed;
    private int racing;
    private int mileage;
    private String colour;
    private String form;
    private Engine engin;

    public Car(int speed, int racing, int mileage, String colour, String form, Engine engin) {
        this.speed = speed;
        this.racing = racing;
        this.mileage = mileage;
        this.colour = colour;
        this.form = form;
        this.engin = engin;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(speed, racing, mileage, colour, form, engin);
    }
}
