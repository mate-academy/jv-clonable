package core.basesyntax;

public class Engine implements Cloneable {
    private String typeShape;
    private String typeOil;
    private String mark;
    private int volume;
    private double weight;

    public Engine(String typeShape, String typeOil, String mark, int volume, double weight) {
        this.typeShape = typeShape;
        this.typeOil = typeOil;
        this.mark = mark;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(typeShape, typeOil, mark, volume, weight);
    }
}


