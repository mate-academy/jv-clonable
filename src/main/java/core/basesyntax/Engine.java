package core.basesyntax;

public class Engine implements Cloneable {
    private String manufacturer;
    private String consumedFuelType;
    private int cylindersNumber;
    private double displacement;
    private int horsePowers;

    public Engine(String manufacturer, String consumedFuelType, int cylindersNumber,
                  double displacement, int horsePowers) {
        this.manufacturer = manufacturer;
        this.consumedFuelType = consumedFuelType;
        this.cylindersNumber = cylindersNumber;
        this.displacement = displacement;
        this.horsePowers = horsePowers;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getConsumedFuelType() {
        return consumedFuelType;
    }

    public void setConsumedFuelType(String consumedFuelType) {
        this.consumedFuelType = consumedFuelType;
    }

    public int getCylindersNumber() {
        return cylindersNumber;
    }

    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public String toString() {
        return (manufacturer + "'s " + cylindersNumber + "-cylinders engine");
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t clone this car", e);
        }
    }
}

