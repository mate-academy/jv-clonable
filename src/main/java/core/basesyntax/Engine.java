package core.basesyntax;

public class Engine implements Cloneable {
    private String engineName;
    private String engineBrand;
    private int engineNumber;
    private double volume;
    private double fuelConsumption;

    public Engine(String engineName, String engineBrand, int engineNumber,
                  double volume, double fuelConsumption) {
        this.engineName = engineName;
        this.engineBrand = engineBrand;
        this.engineNumber = engineNumber;
        this.volume = volume;
        this.fuelConsumption = fuelConsumption;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    @Override
    public String toString() {
        return System.lineSeparator()
                + "  Engine name = '" + engineName + '\'' + System.lineSeparator()
                + "  Engine brand = '" + engineBrand + '\'' + System.lineSeparator()
                + "  Engine number = " + engineNumber + System.lineSeparator()
                + "  Volume = " + volume + System.lineSeparator()
                + "  Fuel consumption = " + fuelConsumption + System.lineSeparator()
                + ".................................";
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine", e);
        }
    }
}
