package core.basesyntax;

public class Car implements Cloneable {
    private int speed;
    private int racing;
    private int mileage;
    private String colour;
    private String form;
    private Engine engin;

    public Car(int sp, int rac, int mil, String col, String foR, Engine eng) {
        speed = sp;
        racing = rac;
        mileage = mil;
        colour = col;
        form = foR;
        engin = eng;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(speed, racing, mileage, colour, form, engin);
    }
}
