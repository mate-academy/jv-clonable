package core.basesyntax;

public class Engine implements Cloneable {
    private int age;
    private String type;
    private int serialNumber;
    private int power;
    private int price;

    public Engine(int ag, String typpe, int number, int pow, int pr) {
        age = ag;
        type = typpe;
        serialNumber = number;
        power = pow;
        price = pr;
    }

    @Override
    protected Engine clone() {
        return new Engine(age, type, serialNumber, power, price);
    }
}
