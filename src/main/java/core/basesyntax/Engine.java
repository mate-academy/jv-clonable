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
    public String toString() {
        return "Engine{"
                + "model=" + model
                + ", color=" + color
                + ", power=" + power
                + ", size=" + size
                + ", energySource=" + energySource + '}';
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public EnergySource getEnergySource() {
        return energySource;
    }

    public void setEnergySource(EnergySource energySource) {
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
