package core.basesyntax;

public class Engine implements Cloneable {

    private String typeOfEngine;
    private int countOfCylinders;
    private int countOfValves;
    private double compressionRatio;
    private String typeOfFuel;

    public Engine(String typeOfEngine, int countOfCylinders,
                  int countOfValves, double compressionRatio, String typeOfFuel) {
        this.typeOfEngine = typeOfEngine;
        this.countOfCylinders = countOfCylinders;
        this.countOfValves = countOfValves;
        this.compressionRatio = compressionRatio;
        this.typeOfFuel = typeOfFuel;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public int getCountOfCylinders() {
        return countOfCylinders;
    }

    public void setCountOfCylinders(int countOfCylinders) {
        this.countOfCylinders = countOfCylinders;
    }

    public int getCountOfValves() {
        return countOfValves;
    }

    public void setCountOfValves(int countOfValves) {
        this.countOfValves = countOfValves;
    }

    public double getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(double compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return new Engine(typeOfEngine,
                countOfCylinders,
                countOfValves,
                compressionRatio,
                typeOfFuel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Engine engine = (Engine) o;
        return countOfCylinders == engine.countOfCylinders
                && countOfValves == engine.countOfValves
                && Double.compare(engine.compressionRatio, compressionRatio) == 0
                && typeOfEngine.equals(engine.typeOfEngine)
                && typeOfFuel.equals(engine.typeOfFuel);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + (typeOfEngine == null ? 0 : typeOfEngine.hashCode());
        result = prime * result + (countOfCylinders * typeOfEngine.hashCode());
        result = prime * result + (countOfValves * typeOfFuel.hashCode());
        long longBits = Double.doubleToLongBits(compressionRatio);
        result = prime * result + (int) (longBits - (longBits >> 32));
        result = prime * result + (typeOfFuel == null ? 0 : typeOfFuel.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Engine{ " + "typeOfEngine = " + typeOfEngine
                + " countOfCylinders = " + countOfCylinders
                + " countOfValves = " + countOfValves
                + " compressionRatio = " + compressionRatio
                + " typeOfFuel = " + typeOfFuel
                + '}';
    }
}
