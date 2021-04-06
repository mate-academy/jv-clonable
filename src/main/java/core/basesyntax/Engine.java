package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String typeOfFuel;
    private int volume;
    private String yearOfProduction;
    private int numberOfCylinders;

    public Engine(String model, String typeOfFuel, int volume, String yearOfProduction,
                  int numberOfCylinders) {
        this.model = model;
        this.typeOfFuel = typeOfFuel;
        this.volume = volume;
        this.yearOfProduction = yearOfProduction;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine ", e);
        }
    }

    @Override
    public String toString() {
        return "Engine {"
                + " model: " + model
                + ", type of fuel: " + typeOfFuel
                + ", volume: " + volume
                + ", year of production: " + yearOfProduction
                + ", number of cylinders: " + numberOfCylinders
                + " }";
    }
}
