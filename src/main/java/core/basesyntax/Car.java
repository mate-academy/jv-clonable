package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private String model;
    private String number;
    private long price;
    private int age;

    public Car(Engine eng, String mod, String num, long pr, int ag) {
        engine = eng;
        model = mod;
        number = num;
        price = pr;
        age = ag;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(engine, model, number, price, age);
    }
}
