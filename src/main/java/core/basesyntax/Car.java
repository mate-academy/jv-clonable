package core.basesyntax;

public class Car implements Cloneable {

    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int win;
    private int yearOfIssue;
    private Engine engine;

    public Car(String brand, String model, String color, String bodyType,
               int win, int yearOfIssue) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.win = win;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public Car clone() {
        Car clonedCar = new Car(this.brand, this.model, this.color,
                this.bodyType, this.win, this.yearOfIssue);
        clonedCar.engine = engine.clone();
        return clonedCar;
    }

    //    public static void main(String[] args) {
    //        Car car = new Car("Subaru", "Forester", "blue", "universal",
    //                1231245, 2000);
    //        car.engine = new Engine("opposite", "petrol", 2, 4, 1231654);
    //        Car clonedCar = car.clone(car);
    //        System.out.println(clonedCar);
    //    }
}
