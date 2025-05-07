package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine jz2 = new Engine("2-JZ","High","Petrol",2.8f,290);
        Engine jz1 = new Engine("1-JZ","Medium","Petrol",2.49f,250);
        Car toyota = new Car("Supra","Red", 1999, 260, jz2);
        Car carClone = toyota.clone();
        toyota.setEngine(jz1);
        System.out.println(toyota);
        System.out.println(carClone);
    }
}
