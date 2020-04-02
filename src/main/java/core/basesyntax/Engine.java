package core.basesyntax;

public class Engine implements Cloneable {
    private String engineName;
    private String engineType;
    private int cylindres;
    private int power;
    private int fuelTankCapacity;

    public Engine(String engineName,
                  String engineType,
                  int cylindres,
                  int power,
                  int fuelTankCapacity) {
        this.engineName = engineName;
        this.engineType = engineType;
        this.cylindres = cylindres;
        this.power = power;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "engineName='" + engineName
                + '\''
                + ", engineType='" + engineType
                + '\''
                + ", cylindres=" + cylindres
                + ", power=" + power
                + ", fuelTankCapacity=" + fuelTankCapacity
                + '}';
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException exception) {
            return new Engine(
                    this.engineName,
                    this.engineType,
                    this.cylindres,
                    this.power,
                    this.fuelTankCapacity);
        }
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getCylindres() {
        return cylindres;
    }

    public void setCylindres(int cylindres) {
        this.cylindres = cylindres;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }
}
