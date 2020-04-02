package core.basesyntax;

public class Car implements Cloneable {
    private String mark;
    private String type;
    private int maxSpeed;
    private String color;
    private Engine nameEngine;

    public Car(String mark, String type, int maxSpeed, String color, Engine nameEngine) {
        this.mark = mark;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.nameEngine = nameEngine;
    }

    @Override
    public Car clone() {
        return new Car(mark, type, maxSpeed, color, nameEngine.clone());
    }

}
