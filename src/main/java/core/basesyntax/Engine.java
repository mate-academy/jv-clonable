package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String company;
    private String origin;
    private String type;
    private int power;


    public Engine(String name, String company, String origin, String type, int power) {
        this.name = name;
        this.company = company;
        this.origin = origin;
        this.type = type;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "name='" + name + '\''
                + ", company='" + company + '\''
                + ", origin='" + origin + '\''
                + ", type='" + type + '\''
                + ", power=" + power
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone engine", e);
        }
    }
}
