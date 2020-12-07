package core.basesyntax;

public class Engine implements Cloneable {
    private String name;
    private String model;
    private String colour;
    private int horsePowers;
    private int cylinders;

    public Engine(String name, String model, String colour, int horsePowers, int cylinders) {
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.horsePowers = horsePowers;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{"
                + "name='" + name + '\''
                + ", model='" + model + '\''
                + ", colour='" + colour + '\''
                + ", horsePowers=" + horsePowers
                + ", cylinders=" + cylinders
                + '}';
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Couldn`t clone Engine", e);
        }
    }
}
