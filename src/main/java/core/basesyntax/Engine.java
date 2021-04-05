package core.basesyntax;

public class Engine implements Cloneable {
    private String kindMotor;
    private String typeOfFuel;
    private String color;
    private int numberOfKeys;
    private int numberOfCylinders;

    public String getKindMotor() {
        return kindMotor;
    }

    public void setKindMotor(String kindMotor) {
        this.kindMotor = kindMotor;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{"
                +
                "kindMotor='" + kindMotor + '\''
                +
                ", typeOfFuel='" + typeOfFuel + '\''
                +
                ", color='" + color + '\''
                +
                ", numberOfKeys=" + numberOfKeys
                +
                ", numberOfCylinders=" + numberOfCylinders
                +
                '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't do clone", e);
        }
    }
}
