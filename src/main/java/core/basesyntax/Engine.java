package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.EnergySource;
import core.basesyntax.enums.Model;
import core.basesyntax.enums.Size;

public class Engine implements Cloneable {
    private Model model;
    private Color color;
    private int power;
    private Size size;
    private EnergySource energySource;

    public Engine(Model model, Color color, int power, Size size, EnergySource energySource) {
        this.model = model;
        this.color = color;
        this.power = power;
        this.size = size;
        this.energySource = energySource;
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
