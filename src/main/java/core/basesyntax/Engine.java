package core.basesyntax;

public class Engine implements Cloneable {
    private int amount;
    private String type;
    private int maxSpeed;
    private int dispersal;
    private boolean isThereColdSys;

    public Engine() {

    }

    public Engine(int amount, String type, int maxSpeed, int dispersal, boolean isThereColdSys) {
        this.amount = amount;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.dispersal = dispersal;
        this.isThereColdSys = isThereColdSys;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setDispersal(int dispersal) {
        this.dispersal = dispersal;
    }

    public void setThereColdSys(boolean thereColdSys) {
        isThereColdSys = thereColdSys;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        Engine clone = new Engine();
        clone.isThereColdSys = this.isThereColdSys;
        clone.dispersal = this.dispersal;
        clone.amount = this.amount;
        clone.setType(this.type);
        clone.maxSpeed = maxSpeed;
        return clone;

    }
}