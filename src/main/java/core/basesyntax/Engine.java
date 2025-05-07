package core.basesyntax;

public class Engine implements Cloneable {
    private int cylinderDiameter;
    private int power;
    private int fuelConsumption;
    private String material;
    private int graduationYear;

    public Engine(int cylinderDiameter, int power, int fuelConsumption,
                  String material, int graduationYear) {
        this.cylinderDiameter = cylinderDiameter;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.material = material;
        this.graduationYear = graduationYear;
    }

    public int getCylinderDiameter() {
        return cylinderDiameter;
    }

    public void setCylinderDiameter(int cylinderDiameter) {
        this.cylinderDiameter = cylinderDiameter;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Override
    public Engine clone() {
        Engine cloneEngine = new Engine(cylinderDiameter, power, fuelConsumption,
                material, graduationYear);
        return cloneEngine;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "cylinderDiameter=" + cylinderDiameter
                + ", power=" + power
                + ", fuelConsumption=" + fuelConsumption
                + ", material='" + material + '\''
                + ", graduationYear=" + graduationYear + '}';
    }
}
