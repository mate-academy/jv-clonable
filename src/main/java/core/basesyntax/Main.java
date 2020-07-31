package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("internal combustion engine", 500, 8, true, true);
        Car audi = new Car("audi", "45.000$", "Black", 250, engine);

        Car audiTt = cloneCar(audi);
    }

    public static Car cloneCar(Car car) {
        Car carClone = null;
        try {
            carClone = (Car) car.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return carClone;
    }

}
