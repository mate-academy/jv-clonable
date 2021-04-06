package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String power;
    private String country;
    private int year;
    private boolean isElectric;

    public Engine(String model, String power, String country, int year, boolean isElectric) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.year = year;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "model='" + model + '\''
                + ", power='" + power + '\''
                + ", country='" + country + '\''
                + ", year=" + year
                + ", isElectric=" + isElectric
                + '}';
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create Engine clone!", e);
        }
    }
}
