package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int power;
    private int efficiency;
    private String typeOfFuel;
    private int numberOfStroke;

    public Engine(String model, int power, int efficiency, String typeOfFuel, int numberOfStroke) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
        this.typeOfFuel = typeOfFuel;
        this.numberOfStroke = numberOfStroke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getNumberOfStroke() {
        return numberOfStroke;
    }

    public void setNumberOfStroke(int numberOfStroke) {
        this.numberOfStroke = numberOfStroke;
    }

    @Override
    public String toString() {
        return "Engine{" + "model='" + model + '\''
                + ", power=" + power
                + ", efficiency=" + efficiency
                + ", typeOfFuel='" + typeOfFuel + '\''
                + ", numberOfStroke=" + numberOfStroke
                + '}';
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone");
        }
    }
}
