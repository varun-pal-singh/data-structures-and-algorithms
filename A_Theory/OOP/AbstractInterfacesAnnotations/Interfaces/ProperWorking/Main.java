package A_Theory.OOP.AbstractInterfacesAnnotations.Interfaces.ProperWorking;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        NiceCar niceCar = new NiceCar(new ElectricEngine(), new MediaPlayer());

        niceCar.engineStart();
        niceCar.mediaStart();

        System.out.println();
        
        niceCar.upgradeEngine(new PowerEngine());

        niceCar.engineStart();
    }
}
