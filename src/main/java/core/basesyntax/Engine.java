package core.basesyntax;

public class Engine implements Cloneable {
    private String type;
    private int cr;
    private int displacement;
    private int bore;
    private int stroke;

    public void setStroke(int stroke) {
        this.stroke = stroke;
    }

    public void setBore(int bore) {
        this.bore = bore;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setCR(int cr) {
        this.cr = cr;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (Exception e) {
            throw new RuntimeException("Can't create Engine clone", e);
        }
    }

    @Override
    public String toString() {
        return "{" + "type='" + type + '\''
                + ", CR='" + cr + '\''
                + ", displacement='" + displacement + '\''
                + ", bore='" + bore + '\''
                + ", stroke='" + stroke + '\'' + '}';
    }
}
