package core.basesyntax;

import java.util.Date;

public class Engine implements Cloneable {
    private String model;
    private Date manufactureDate;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        return "Engine{" +
                "model='" + model + '\'' +
                ", manufactureDate=" + manufactureDate +
                '}';
    }
}
