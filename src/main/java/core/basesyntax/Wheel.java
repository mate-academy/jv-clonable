package core.basesyntax;

public class Wheel implements Cloneable {
    public int size;
    public String mark;

    public Wheel(int size, String mark) {
        this.size = size;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark;
    }

    @Override
    public Wheel clone() {
        return new Wheel(size, mark);
    }
}
