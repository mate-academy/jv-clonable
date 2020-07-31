package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String specification;
    private int yearOfMade;
    private String countryOfMade;
    private int serialNumber;

    public Engine(String model, String specification, int yearOfMade,
                  String countryOfMade, int serialNumber) {
        this.model = model;
        this.specification = specification;
        this.yearOfMade = yearOfMade;
        this.countryOfMade = countryOfMade;
        this.serialNumber = serialNumber;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(model, specification, yearOfMade, countryOfMade, serialNumber);
    }
}
