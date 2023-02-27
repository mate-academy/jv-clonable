package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine("Diesel",265,
                8,2.5,false);
        Car car = new Car("Campry",2015,engine,240,"Toyota");
        Car clonedCar = car.clone();
        car.getEngine().setHorsePower(350);
        System.out.println(car);
        System.out.println(clonedCar);
    }
}
