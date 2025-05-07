package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        
        Engine volkswagenV8 = new Engine("TurboV8",
                "SKT-GT5932", 7, 8, true);
        Car slavuta = new Car("Slavuta", "GT9", volkswagenV8, 18, 2000);

        Car carClone = slavuta.clone();
        slavuta.setCapacity(20);

        System.out.println(slavuta.toString());
        System.out.println(carClone.toString());
    }
}
