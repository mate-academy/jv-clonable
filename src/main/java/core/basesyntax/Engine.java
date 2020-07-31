package core.basesyntax;

public class Engine implements Cloneable {
    private String brand;
    private String madeIn;
    private int sizeInLiters;
    private int yearMade;
    private boolean needsRepair;

    public Engine(String brand, String madeIn, int sizeInLiters, int yearMade,
                  boolean needsRepair) {
        this.brand = brand;
        this.madeIn = madeIn;
        this.sizeInLiters = sizeInLiters;
        this.yearMade = yearMade;
        this.needsRepair = needsRepair;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(this.brand, this.madeIn, this.sizeInLiters, this.yearMade,
                this.needsRepair);
    }
}
