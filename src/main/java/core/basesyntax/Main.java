package core.basesyntax;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("sad", 345, 34554, 43534, 45);
        Car car = new Car("sdf", "fgfdfgfdg", Color.BLACK, 546, true, engine);
        System.out.println(car);
        try {
            System.out.println(car.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

