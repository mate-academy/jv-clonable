package core.basesyntax;

public class Engine implements Cloneable {

    private String series;
    private String model;
    private String type;
    private String status;
    private int cost;

    public Engine(String series, String model, String type, String status, int cost) {
        this.series = series;
        this.model = model;
        this.type = type;
        this.status = status;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
