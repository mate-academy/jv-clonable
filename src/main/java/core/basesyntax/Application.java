package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine engine = new Engine(750,"black",
                "Petrol","new",9000);
        Engine secondEngine = new Engine(120,"black",
                "Diesel","new",3000);
        Car car = new Car(engine,4,"Galardo","Red","Lamborghini");
        Car clonedCar = car.clone();
        clonedCar.setEngine(secondEngine);
        System.out.println(car);
        System.out.println(clonedCar);
    }
}
