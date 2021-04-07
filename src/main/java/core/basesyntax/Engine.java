package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String country;
    private int year;
    private int speed;
    private int displacement;

    public Engine(String model, String country, int year, int speed, int displacement) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.speed = speed;
        this.displacement = displacement;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDisplacement() {
        return displacement;
    }

    @Override
    public String toString() {
        return "------------------" + System.lineSeparator()
                + " > Engine" + System.lineSeparator()
                + "------------------" + System.lineSeparator()
                + "Model : " + model + System.lineSeparator()
                + "Country : " + country + System.lineSeparator()
                + "Year : " + year + System.lineSeparator()
                + "Max. Speed : " + speed + System.lineSeparator()
                + "Displacement : " + displacement + System.lineSeparator()
                + "------------------" + System.lineSeparator();
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Comrade, I can't clone the engine! Look: ", e);
        }
    }
}
