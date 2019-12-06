package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int cylinders;
    private String fuelType;
    private int yearOfConstruction;
    private int weight;
    private int width;
    private int heights;

    public Engine(String type, int cylinders, String fuelType,
                  int yearOfConstruction, int weight, int width, int heights) {
        this.type = type;
        this.cylinders = cylinders;
        this.fuelType = fuelType;
        this.yearOfConstruction = yearOfConstruction;
        this.weight = weight;
        this.width = width;
        this.heights = heights;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeights() {
        return heights;
    }

    public void setHeights(int heights) {
        this.heights = heights;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
