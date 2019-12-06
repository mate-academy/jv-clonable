package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Engine engineforAudi = new Engine(125,"DE-145",8,2,"VW");
        Car audi = new Car(engineforAudi,"A8",2018,40,60);
        Car cloneOfAudi = audi.clone();
        System.out.println(cloneOfAudi);
    }
}
