package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private String model;
    private boolean isElectrical;
    private int horsepower;
    private int maximalKilometers;

    public int getMaximalKilometers() {
        return maximalKilometers;
    }

    public void setMaximalKilometers(int maximalKilometers) {
        this.maximalKilometers = maximalKilometers;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean getIsElectrical() {
        return isElectrical;
    }

    public void setIsElectrical(boolean isElectrical) {
        this.isElectrical = isElectrical;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "type = " + type
                + ", model = " + model
                + ", is electrical = " + isElectrical
                + ", horse power = " + horsepower
                + ", maximal kilometers" + maximalKilometers
                + "}";
    }

    @Override
    public Engine clone() {
        Engine clonedEngine = new Engine();
        clonedEngine.setModel(this.model);
        clonedEngine.setType(this.type);
        clonedEngine.setMaximalKilometers(this.maximalKilometers);
        clonedEngine.setIsElectrical(this.isElectrical);
        clonedEngine.setHorsepower(this.horsepower);
        return clonedEngine;
    }
}
