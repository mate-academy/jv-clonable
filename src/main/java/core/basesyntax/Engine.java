package core.basesyntax;

/**
 * Дано класс Car и класс Engine. Определите метод клон так чтобы клонирование было глубоким.
 * Добавьте минимум 5 полей в каждый класс (Car and Engine).
 * Не забудьте использовать двигатель в автомобиле.
 */

public class Engine implements Cloneable {
    private String nameEngine;
    private String modelEngine;
    private int volumeEngine;
    private int ageEngine;
    private int weightEngine;

    public Engine(String nameEngine, String modelEngine, int volumeEngine,
                  int ageEngine, int weightEngine) {
        this.nameEngine = nameEngine;
        this.modelEngine = modelEngine;
        this.volumeEngine = volumeEngine;
        this.ageEngine = ageEngine;
        this.weightEngine = weightEngine;
    }

    @Override
    public Engine clone() {
        return new Engine(nameEngine, modelEngine, volumeEngine, ageEngine, weightEngine);
    }

    public String getNameEngine() {
        return nameEngine;
    }

    public String getModelEngine() {
        return modelEngine;
    }

    public int getVolumeEngine() {
        return volumeEngine;
    }

    public int getAgeEngine() {
        return ageEngine;
    }

    public int getWeightEngine() {
        return weightEngine;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "nameEngine='" + nameEngine + '\''
                + ", modelEngine='" + modelEngine + '\''
                + ", volumeEngine=" + volumeEngine
                + ", ageEngine=" + ageEngine
                + ", weightEngine=" + weightEngine
                + '}';
    }
}
