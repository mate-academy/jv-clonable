package core.basesyntax;

public class Car implements Cloneable {
    private String markName;
    private int maxSpeed;
    private int age;
    private String color;
    private Engine engine;

    public Car(String markName, int maxSpeed, int age, String color, Engine engine) {
        this.markName = markName;
        this.maxSpeed = maxSpeed;
        this.age = age;
        this.color = color;
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(markName, maxSpeed, age, color, engine.clone());
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{"
                + "markName='" + markName + '\''
                + ", maxSpeed=" + maxSpeed
                + ", age=" + age
                + ", color='" + color + '\''
                + ", engine=" + engine
                + '}';
    }
}
