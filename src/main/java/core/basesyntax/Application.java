package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(700,20,"GAZ",3700,"Volkswagen");
        Car car = new Car(engine,"red",2300.25,"Skoda","UA");
        System.out.println(car);
        Car carClone = car.clone();
        car.setEngine(new Engine(73400,2034,"GAfsdfZ",3400,"Vodfgn"));
        System.out.println(carClone);

    }
}
