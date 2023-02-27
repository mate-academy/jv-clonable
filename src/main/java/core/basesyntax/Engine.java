package core.basesyntax;

public class Engine implements Cloneable {
    private String typeOfFuel;
    private int horsePower;
    private int numberOfValves;
    private double volume;
    private boolean isTurbine;

    public Engine(String typeOfFuel, int horsePower,
                  int numberOfValves, double volume, boolean isTurbine) {
        this.typeOfFuel = typeOfFuel;
        this.horsePower = horsePower;
        this.numberOfValves = numberOfValves;
        this.volume = volume;
        this.isTurbine = isTurbine;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isTurbine() {
        return isTurbine;
    }

    public void setTurbine(boolean turbine) {
        isTurbine = turbine;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone", e);
        }
    }

    @Override
    public String toString() {
        return " { typeOfFuel='" + typeOfFuel + '\''
                + ", horsePower=" + horsePower
                + ", numberOfValves=" + numberOfValves
                + ", volume=" + volume
                + ", isTurbine = " + isTurbine
                + '}';
    }
}
