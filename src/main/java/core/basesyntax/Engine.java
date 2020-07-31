package core.basesyntax;

public class Engine implements Cloneable {
    private String typeOfEngine;
    private String name;
    private int power;
    private String code;
    private String producing;

    public Engine(String typeOfEngine, String name,
                  int power, String code, String producing) {
        this.typeOfEngine = typeOfEngine;
        this.name = name;
        this.power = power;
        this.code = code;
        this.producing = producing;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(typeOfEngine, name, power, code, producing);
    }
}
