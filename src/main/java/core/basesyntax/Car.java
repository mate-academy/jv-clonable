package core.basesyntax;

public class Car implements Cloneable {
    private String name;
    private String color;
    private int weight;
    private int maxSpeed;
    private int seats;
    private Engine engine;

    public Car(String name, String color, int weight, int maxSpeed, int seats) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(int cilindersNumber,
                          int volumeCilinders,
                          int weightEngine,
                          String engineType,
                          String kppType) {
        this.engine = new Engine(cilindersNumber,
                volumeCilinders,
                weightEngine,
                engineType,
                kppType);
    }

    public void startEngine() {
        if (engine != null) {
            engine.startEngine();
        } else {
            System.out.println("Engine doesn't exist!");
        }
    }

    public void stopEngine() {
        if (engine != null) {
            engine.stopEngine();
        } else {
            System.out.println("Engine doesn't exist!");
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Car clonedCar = new Car(
                this.getName(),
                this.getColor(),
                this.getWeight(),
                this.getMaxSpeed(),
                this.getSeats());
        if (engine != null) {
            try {
                clonedCar.engine = (Engine) this.engine.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                System.out.println("Error! Engine don't exist");
                return clonedCar;
            }
        } else {
            System.out.println("Car without engine!");
        }
        return clonedCar;
    }

    @Override
    public String toString() {
        return "Car{"
                + "name='" + name + '\''
                + ", color='" + color + '\''
                + ", weight=" + weight
                + ", maxSpeed=" + maxSpeed
                + ", seats=" + seats
                + ", engine=" + engine
                + '}';
    }
}
