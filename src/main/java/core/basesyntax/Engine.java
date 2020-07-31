package core.basesyntax;

public class Engine implements Cloneable {
    private String capacity;
    private String typoOfFuel;
    private int countOfCylinders;
    private int maxTemp;
    private int power;

    public Engine(String capacity, String typoOfFuel,
                  int countOfCylinders, int maxTemp, int power) {
        this.capacity = capacity;
        this.typoOfFuel = typoOfFuel;
        this.countOfCylinders = countOfCylinders;
        this.maxTemp = maxTemp;
        this.power = power;
    }

    public void start() {
        System.out.println("Двигатель запущен...");
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(capacity, typoOfFuel, countOfCylinders, maxTemp, power);
    }
}
