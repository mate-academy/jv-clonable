package core.basesyntax;

public class Engine implements Cloneable {
    private String series;
    private String purpose;
    private String fuelsType;
    private double inputPower;
    private double efficiencyCoefficient;

    public void setSeries(String series) {
        this.series = series;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setFuelsType(String fuelsType) {
        this.fuelsType = fuelsType;
    }

    public void setInputPower(double inputPower) {
        this.inputPower = inputPower;
    }

    public void setEfficiencyCoefficient(double efficiencyCoefficient) {
        this.efficiencyCoefficient = efficiencyCoefficient;
    }

    public String getSeries() {
        return series;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getFuelsType() {
        return fuelsType;
    }

    public double getInputPower() {
        return inputPower;
    }

    public double getEfficiencyCoefficient() {
        return efficiencyCoefficient;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }

    @Override
    public String toString() {
        return "type of flue " + fuelsType;
    }
}
