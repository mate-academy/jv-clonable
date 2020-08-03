package core.basesyntax;

public class Engine implements Cloneable {
    private int countOfHorsePower;
    private double volume;
    private int countOfValves;
    private String type;
    private int yearOfMade;

    public Engine(int countOfHorsePower, double volume, int countOfValves, String type, int yearOfMade) {
        this.countOfHorsePower = countOfHorsePower;
        this.volume = volume;
        this.countOfValves = countOfValves;
        this.type = type;
        this.yearOfMade = yearOfMade;
    }

    public int getCountOfHorsePower() {
        return countOfHorsePower;
    }

    public void setCountOfHorsePower(int countOfHorsePower) {
        this.countOfHorsePower = countOfHorsePower;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCountOfValves() {
        return countOfValves;
    }

    public void setCountOfValves(int countOfValves) {
        this.countOfValves = countOfValves;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(countOfHorsePower, volume, countOfValves, type, yearOfMade);
    }
}
