package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String serialnumber;
    private double weight;
    private double power;
    private double maxRotationFreq;

    public Engine(String model, String serialnumber, double weight,
                  double power, double maxRotationFreq) {
        this.model = model;
        this.serialnumber = serialnumber;
        this.weight = weight;
        this.power = power;
        this.maxRotationFreq = maxRotationFreq;
    }

    public Engine() {
        System.out.println("Engine installed");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getMaxRotationFreq() {
        return maxRotationFreq;
    }

    public void setMaxRotationFreq(double maxRotationFreq) {
        this.maxRotationFreq = maxRotationFreq;
    }

    @Override
    public Engine clone() {
        return new Engine(this.getModel(), this.getSerialnumber(),
                this.getWeight(), this.getPower(), this.getMaxRotationFreq());
    }
}
