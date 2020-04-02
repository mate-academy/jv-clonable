package core.basesyntax;

public class Color implements Cloneable {
    public String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

    @Override
    public Color clone() throws CloneNotSupportedException {
        return (Color) super.clone();
    }
}
