package core.basesyntax;

public class Engine implements Cloneable {
    private String model;
    private String type;
    private int price;
    private int year;
    private boolean isNew;

    public String getModel() {
        return model;
    }

    public Engine setModel(String model) {
        this.model = model;
        return this;
    }

    public String getType() {
        return type;
    }

    public Engine setType(String type) {
        this.type = type;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Engine setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Engine setYear(int year) {
        this.year = year;
        return this;
    }

    public boolean isNew() {
        return isNew;
    }

    public Engine setNew(boolean isNew) {
        this.isNew = isNew;
        return this;
    }

    public Engine(String model, String type, int price, int year, boolean isNew) {
        this.model = model;
        this.type = type;
        this.price = price;
        this.year = year;
        this.isNew = isNew;
    }

    @Override
    protected Engine clone()
            throws CloneNotSupportedException {
        return new Engine(model, type, price, year, isNew);
    }
}
