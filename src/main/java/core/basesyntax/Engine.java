package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private int power;
    private int lifeTime;
    private boolean isStarted;
    private boolean isStopped;

    public Engine(String model, int power, int lifeTime, boolean isStarted, boolean isStopped) {
        this.model = model;
        this.power = power;
        this.lifeTime = lifeTime;
        this.isStarted = isStarted;
        this.isStopped = isStopped;
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

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public boolean isStopped() {
        return isStopped;
    }

    public void setStopped(boolean stopped) {
        isStopped = stopped;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + model + '\''
                + ", power=" + power
                + ", lifeTime=" + lifeTime
                + ", isStarted=" + isStarted
                + ", isStopped=" + isStopped
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine");
        }
    }
}
