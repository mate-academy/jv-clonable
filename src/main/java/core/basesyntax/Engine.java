package core.basesyntax;

public class Engine implements Cloneable {
    private String engineModel;
    private int power;
    private int speedRate;
    private int cylindersPower;
    private int volume;

    public Engine(String engineModel, int power,
                  int speedRate, int cylindersPower, int volume) {
        this.engineModel = engineModel;
        this.power = power;
        this.speedRate = speedRate;
        this.cylindersPower = cylindersPower;
        this.volume = volume;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeedRate() {
        return speedRate;
    }

    public void setSpeedRate(int speedRate) {
        this.speedRate = speedRate;
    }

    public int getCylindersPower() {
        return cylindersPower;
    }

    public void setCylindersPower(int cylindersPower) {
        this.cylindersPower = cylindersPower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        try {
            return (Engine)super.clone();
        } catch (CloneNotSupportedException e) {
            return new Engine(engineModel, power, speedRate, cylindersPower, volume);
        }
    }
}
