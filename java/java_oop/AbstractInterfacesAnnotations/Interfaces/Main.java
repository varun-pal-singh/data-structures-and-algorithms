package java.java_oop.AbstractInterfacesAnnotations.Interfaces;

import java.java_oop.AbstractInterfacesAnnotations.Interfaces.ProperWorking.ElectricEngine;
import java.java_oop.AbstractInterfacesAnnotations.Interfaces.ProperWorking.MediaPlayer;
import java.java_oop.AbstractInterfacesAnnotations.Interfaces.ProperWorking.NiceCar;
import java.java_oop.AbstractInterfacesAnnotations.Interfaces.ProperWorking.PowerEngine;

public class Main {
    public static void main(String[] args) {
        
        Car1 obj1 = new Car1();
        obj1.start();
        obj1.stop();
        obj1.acc();
        obj1.brake();
        obj1.size();
        System.out.println(Car1.size);  // bcoz size is static
    
        //######################
        System.out.println();
        // #####################

        NiceCar niceCar = new NiceCar(new ElectricEngine(), new MediaPlayer());

        niceCar.engineStart();
        niceCar.mediaStart();

        niceCar.upgradeEngine(new PowerEngine());

        niceCar.engineStart();
    }
}
