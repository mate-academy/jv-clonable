package core.basesyntax;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine = new Engine(100, 4, 20, 200, 40);
        Car volvo = new Car("Volvo", 100, 4, false, engine);

        Car citroen = volvo.clone();
        citroen.setModel("Citroen");

        volvo.describe();
        citroen.describe();
    }
}
