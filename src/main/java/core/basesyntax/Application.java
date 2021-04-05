package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Engine twinHPower = new Engine("Twin H-Power", 6, 170,
                85.6, true);

        Car docHudsonHornet = new Car("Hudson Hornet", "deep dark blue", 1951,
                twinHPower, true);

        Car docsClone = docHudsonHornet.clone();
        twinHPower.setPrice(86.0);
        System.out.println(docHudsonHornet.toString());
        System.out.println(docsClone.toString());
    }
}
