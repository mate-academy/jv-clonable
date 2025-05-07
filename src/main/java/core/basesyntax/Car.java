package core.basesyntax;

public class Car implements Cloneable {
    private String owner;
    private String countryRegistration;
    private String model;
    private String country;
    private int year;
    private Engine engineModel;

    public Car(String owner, String countryRegistration,
               String model, String country, int year, Engine engineModel) {
        this.owner = owner;
        this.countryRegistration = countryRegistration;
        this.model = model;
        this.country = country;
        this.year = year;
        this.engineModel = engineModel;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCountryRegistration(String countryRegistration) {
        this.countryRegistration = countryRegistration;
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

    public void setEngineModel(Engine engineModel) {
        this.engineModel = engineModel;
    }

    public String getOwner() {
        return owner;
    }

    public String getCountryRegistration() {
        return countryRegistration;
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

    public Engine getEngineModel() {
        return engineModel;
    }

    @Override
    public String toString() {
        return "==================" + System.lineSeparator()
                + " CAR LICENSE" + System.lineSeparator()
                + "==================" + System.lineSeparator()
                + "OWNER : " + owner + System.lineSeparator()
                + "REGISTRATION : " + countryRegistration + System.lineSeparator()
                + "Model : " + model + System.lineSeparator()
                + "Country : " + country + System.lineSeparator()
                + "Year : " + year + System.lineSeparator()
                + engineModel.toString()
                + "==================" + System.lineSeparator();
    }

    @Override
    public Car clone() {
        try {
            Car clonedCar = (Car) super.clone();
            clonedCar.setEngineModel(engineModel.clone());
            return clonedCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Comrade, I can't clone car! Look: ", e);
        }
    }
}
