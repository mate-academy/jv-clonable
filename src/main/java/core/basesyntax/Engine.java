package core.basesyntax;

public class Engine implements Cloneable {
    private int power;
    private String modelOfEngine;
    private int workedYears;
    private int amountOfLitres;
    private String vinCode;

    public Engine(int power, String model, int workedYears, int amountOfLitres, String vinCode) {
        this.power = power;
        this.modelOfEngine = modelOfEngine;
        this.workedYears = workedYears;
        this.amountOfLitres = amountOfLitres;
        this.vinCode = vinCode;
    }

    public Engine() {

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModelOfEngine() {
        return modelOfEngine;
    }

    public void setModelOfEngine(String modelOfEngine) {
        this.modelOfEngine = modelOfEngine;
    }

    public int getWorkedYears() {
        return workedYears;
    }

    public void setWorkedYears(int workedYears) {
        this.workedYears = workedYears;
    }

    public int getAmountOfLitres() {
        return amountOfLitres;
    }

    public void setAmountOfLitres(int amountOfLitres) {
        this.amountOfLitres = amountOfLitres;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    @Override
    public String toString() {
        return "Engine: " + "power = " + power
                + " modelOfEngine = " + modelOfEngine
                + " workedYears = " + workedYears
                + " amountOfLitres = " + amountOfLitres
                + " vinCode = " + vinCode;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can not clone engine", e);
        }
    }
}
