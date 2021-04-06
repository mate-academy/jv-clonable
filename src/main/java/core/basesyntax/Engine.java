package core.basesyntax;

class Engine implements Cloneable {
    private int power;
    private String manufacturer;
    private int price;
    private int year;
    private boolean inStock;

    public Engine(int power, String manufacturer,int price, int year, boolean inStock) {
        this.power = power;
        this.manufacturer = manufacturer;
        this.price = price;
        this.year = year;
        this.inStock = inStock;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cant clone the Car");
        }
    }

}
