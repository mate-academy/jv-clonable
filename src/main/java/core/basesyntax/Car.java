package core.basesyntax;

public class Car implements Cloneable {
    private int seatingCapacity;
    private String typeWheelDrive;
    private String transmissionType;
    private String bodyType;
    private Engine engine;

    public Car(int seatingCapacity, String typeWheelDrive, String transmissionType,
               String bodyType, Engine engine) {
        this.seatingCapacity = seatingCapacity;
        this.typeWheelDrive = typeWheelDrive;
        this.transmissionType = transmissionType;
        this.bodyType = bodyType;
        this.engine = engine;
    }

    public Car clone() throws CloneNotSupportedException {
        return new Car(seatingCapacity, typeWheelDrive, transmissionType,
                bodyType,engine.clone());
    }
}

