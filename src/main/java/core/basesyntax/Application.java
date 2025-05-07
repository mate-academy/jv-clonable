package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine twojz = new Engine("2jz-ge","line 6",3.0, 210,false);
        Car supra = new Car("Toyota Supra","black",1999,40000,twojz);

        Car clonedSupra = supra.clone();
        System.out.println(supra);
        System.out.println(clonedSupra);
        twojz.setName("2jz-gte");
        twojz.setHorsePower(330);
        twojz.setTurboCharged(true);
        System.out.println(supra);
    }
}
