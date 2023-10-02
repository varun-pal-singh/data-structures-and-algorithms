package A_Theory.OOP.AbstractInterfacesAnnotations.Interfaces.ProperWorking;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Car");
        NiceCar simpleCar = new NiceCar();

        simpleCar.engineStart();
        simpleCar.engineStop();

        System.out.println();

        simpleCar.upgradeEngine(new ElectricEngine());

        simpleCar.engineStart();
        simpleCar.engineStop();
        simpleCar.mediaStart();
        simpleCar.mediaStop();

        System.out.println("Nice Car");
        NiceCar niceCar = new NiceCar(new ElectricEngine(), new MediaPlayer());

        niceCar.engineStart();
        niceCar.mediaStart();

        System.out.println();

        niceCar.upgradeEngine(new PowerEngine());

        niceCar.engineStart();

    }
}
