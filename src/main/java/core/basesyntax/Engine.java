package core.basesyntax;

public class Engine implements Cloneable {
    private String series;
    private int displacing;
    private int size;
    private String typeOfEnergy;
    private String forOrganizing;

    public Engine(String series, int displacing, int size,
                  String typeOfEnergy, String forOrganizing) {
        this.series = series;
        this.displacing = displacing;
        this.size = size;
        this.typeOfEnergy = typeOfEnergy;
        this.forOrganizing = forOrganizing;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(series, displacing, size, typeOfEnergy, forOrganizing);
    }
}
