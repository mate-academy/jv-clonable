package core.basesyntax;

public class Car implements  Cloneable {

    private int quantityOfWheels;
    private String color;
    private boolean leftSteeringWheel;
    private Engine engine;

    public int getQuantityOfWheels() {
        return quantityOfWheels;
    }

    public void setQuantityOfWheels(int quantityOfWheels) {
        this.quantityOfWheels = quantityOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLeftSteeringWheel() {
        return leftSteeringWheel;
    }

    public void setLeftSteeringWheel(boolean leftSteeringWheel) {
        this.leftSteeringWheel = leftSteeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isTransmissionAuto() {
        return transmissionAuto;
    }

    public void setTransmissionAuto(boolean transmissionAuto) {
        this.transmissionAuto = transmissionAuto;
    }

    private boolean transmissionAuto;

    public Car(int quantityOfWheels, String color, boolean leftSteeringWheel, Engine engine) {
        this.quantityOfWheels = quantityOfWheels;
        this.color = color;
        this.leftSteeringWheel = leftSteeringWheel;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        return new Car(quantityOfWheels, color, leftSteeringWheel, engine);
    }
}
