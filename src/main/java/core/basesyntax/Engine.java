package core.basesyntax;

public class Engine implements Cloneable {
    private double engineVolume;
    private int numberOfCylinders;
    private String typeOfFuel;
    private String fuelSupplySystem;
    private int maximumHorsepower;

    public Engine(double engineVolume, int numberOfCylinders, String typeOfFuel,
                  String fuelSupplySystem, int maximumHorsepower) {
        this.engineVolume = engineVolume;
        this.numberOfCylinders = numberOfCylinders;
        this.typeOfFuel = typeOfFuel;
        this.fuelSupplySystem = fuelSupplySystem;
        this.maximumHorsepower = maximumHorsepower;
    }

    public void setMaximumHorsepower(int maximumHorsepower) {
        this.maximumHorsepower = maximumHorsepower;
    }

    @Override
    public String toString() {
        return "Engine{" + "engineVolume=" + engineVolume
                + ", numberOfCylinders=" + numberOfCylinders
                + ", typeOfFuel='" + typeOfFuel + '\''
                + ", fuelSupplySystem='" + fuelSupplySystem + '\''
                + ", maximumHorsepower=" + maximumHorsepower + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone Engine", e);
        }
    }
}
