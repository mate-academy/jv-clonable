package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Engine engine = new Engine(400,"V",
                "gasoline",12,320);
        Car car = new Car("Lamborghini ","Aventador",
                      "Yellow",2008,5,engine);
        Car clonedCar = car.clone();
        car.getEngine().setPowerOfEngine(440);
        System.out.println(car);
        System.out.println(clonedCar);
        System.out.println(car.getEngine().equals(clonedCar.getEngine()));
    }
}
