package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // test your code here ...
        Engine engine = new Engine(12,43,"Agusha",23,78);
        Car car = new Car(56,"vasya",567,123,engine);
        Object clonedCar = car.clone();
        car.setName("Petr");
        System.out.println(car);
        System.out.println(clonedCar);

    }
}
