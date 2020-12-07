package core.basesyntax;

public class Engine implements Cloneable {
    private Integer horsePower;
    private Integer countOfCylinder;
    private String type;
    private String height;
    private String weight;

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getCountOfCylinder() {
        return countOfCylinder;
    }

    public void setCountOfCylinder(Integer countOfCylinder) {
        this.countOfCylinder = countOfCylinder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "horsePower=" + horsePower
                + ", countOfCylinder=" + countOfCylinder
                + ", type='" + type + '\''
                + ", height='" + height + '\''
                + ", weight='" + weight + '\''
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create clone", e);
        }
    }
}
