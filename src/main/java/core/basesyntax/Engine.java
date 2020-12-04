package core.basesyntax;

public class Engine implements Cloneable {

    private int power;
    private int serialNumber;
    private int repairCost;
    private String model;
    private final int yearOfProduction;

    public Engine(int power, int serialNumber, int repairCost, String model, int yearOfProduction) {
        this.power = power;
        this.serialNumber = serialNumber;
        this.repairCost = repairCost;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Could not clone car", e);
        }
    }

    public String toString() {
        return new StringBuilder("Engine: model = ").append(this.model)
                .append(", power = ").append(this.power)
                .append(", serialNumber = ").append(this.serialNumber)
                .append(", repairCost = ").append(this.repairCost)
                .append(", yearOfProduction = ").append(this.yearOfProduction)
                .toString();
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getRepairCost() {
        return this.repairCost;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return this.yearOfProduction;
    }
}
