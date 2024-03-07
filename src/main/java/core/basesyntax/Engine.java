package core.basesyntax;

import java.util.Date;

public class Engine implements Cloneable {
    private String id;
    private String model;
    private String type;
    private int price;
    private Date manufactureDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can not clone engine.", e);
        }
    }

    @Override
    public String toString() {
        return "Engine{"
                + "id='" + id + '\'' + ", model='" + model + '\'' + ", type='" + type + '\''
                + ", price=" + price + ", manufactureDate=" + manufactureDate + '}';
    }
}
