package core.basesyntax;

import java.awt.Color;

public class Car implements Cloneable {
    private String carMake;
    private String modelOfCar;
    private Color colorCar;
    private int yearOfIssue;
    private boolean airBag;
    private Engine engine;

    public Car(String carMake, String modelOfCar, Color colorCar,int yearOfIssue,boolean airBag,
                Engine engine) {
        this.carMake = carMake;
        this.modelOfCar = modelOfCar;
        this.colorCar = colorCar;
        this.yearOfIssue = yearOfIssue;
        this.airBag = airBag;
        this.engine = engine;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public void setColorCar(Color colorCar) {
        this.colorCar = colorCar;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public Color getColorCar() {
        return colorCar;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public boolean getAirBag() {
        return airBag;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car cloned = (Car) super.clone();
        cloned.setEngine((Engine)cloned.getEngine().clone());
        //cloned.setDepartment((Department)cloned.getDepartment().clone());
        return cloned;
    }
}
