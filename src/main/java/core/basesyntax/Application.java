package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine bmwEngine = new Engine("M10", "BMW",
                1254687, 4.2, 15.3);
        Car bmwM5 = new Car("BMW", "M5", "AA5798CN",
                2010, 40, bmwEngine);
        System.out.println(bmwM5);
        Car clonedBmwM5 = bmwM5.clone();
        System.out.println(clonedBmwM5);
        bmwM5.setYearOfCarProduction(2020);
        bmwEngine.setEngineBrand("Volvo");
        System.out.println(bmwM5);
        System.out.println(clonedBmwM5);
    }
}
