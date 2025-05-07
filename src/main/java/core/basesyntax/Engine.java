package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int cylinderNumber;
    private double displacement;
    private double maximumPower;
    private String fuel;

    public Engine(String model, int cylinderNumber, double displacement, double maximumPower,
                  String fuel) {
        this.model = model;
        this.cylinderNumber = cylinderNumber;
        this.displacement = displacement;
        this.maximumPower = maximumPower;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public int getCylinderNumber() {
        return cylinderNumber;
    }

    public double getDisplacement() {
        return displacement;
    }

    public double getMaximumPower() {
        return maximumPower;
    }

    public String getFuel() {
        return fuel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCylinderNumber(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public void setMaximumPower(double maximumPower) {
        this.maximumPower = maximumPower;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" + "model='" + model + '\''
                + ", cylinderNumber=" + cylinderNumber
                + ", displacement=" + displacement
                + ", maximumPower=" + maximumPower
                + ", fuel='" + fuel + '\'' + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Engine(this.model, this.cylinderNumber, this.displacement, this.maximumPower,
                    this.fuel);
        }
    }
}
