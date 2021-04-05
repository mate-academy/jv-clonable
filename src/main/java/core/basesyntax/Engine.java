package core.basesyntax;


public class Engine implements Cloneable {
    private String model;
    private int cylindersNumber;
    private int horsePower;
    private double price;
    private boolean isLoud;

    public Engine(String model, int cylindersNumber, int horsePower, double price, boolean isLoud) {
        this.model = model;
        this.cylindersNumber = cylindersNumber;
        this.horsePower = horsePower;
        this.price = price;
        this.isLoud = isLoud;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCylindersNumber() {
        return cylindersNumber;
    }

    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean setIsLoud() {
        return isLoud;
    }

    public void getIsLoud(boolean isLoud) {
        this.isLoud = isLoud;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create engine clone", e);
        }
    }

    @Override
    public String toString() {
        return " {" +
                "model = " + model +
                ", cylindersNumber = " + cylindersNumber +
                ", horsePower = " + horsePower +
                ", price = " + price +
                ", isLoud = " + isLoud +
                '}';
    }
}
