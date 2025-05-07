package core.basesyntax;

public class Engine implements Cloneable {
    private String gasOrDiesel;
    private String name;
    private String form;
    private int volume;
    private int power;

    public String getGasOrDiesel() {
        return gasOrDiesel;
    }

    public void setGasOrDiesel(String gasOrDiesel) {
        this.gasOrDiesel = gasOrDiesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine";
    }

    @Override
    protected Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone Engine", e);
        }
    }
}
