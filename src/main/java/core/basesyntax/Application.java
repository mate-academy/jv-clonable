package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Engine electric = new Engine();
        electric.setType("Electric");
        electric.setSpeed(260);
        electric.setPower(400);
        electric.setWeight(500);

        Engine fuel = new Engine();
        fuel.setType("Fuel");
        fuel.setVolume(4);
        fuel.setSpeed(320);
        fuel.setPower(540);
        fuel.setWeight(1800);

        Car volvo = new Car();
        volvo.setColor("RED");
        volvo.setName("Volvo");
        volvo.setPrice(40000);
        volvo.setYear(2019);
        volvo.setEngine(electric);

        Car cloneVolvo = volvo.clone();
        volvo.setEngine(fuel);
        System.out.println("cloneVolvo: " + cloneVolvo);
        System.out.println("volvo:" + volvo);

    }
}
