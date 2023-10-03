package java.java_oop.AbstractInterfacesAnnotations.Interfaces;

import java.java_oop.AbstractInterfacesAnnotations.Interfaces.ProperWorking.Engine;
import java.java_oop.AbstractInterfacesAnnotations.Interfaces.ProperWorking.Media;

public class Car1 implements Engine, Tyre, Media{
    @Override
    public void start(){    
        System.out.println("Inside Car1's start()");
    }
// it does not conflicts with engine and media Interfaces 
// because, this class has its own start() and stop() methods.

// this functionality was also provided in Abstract classes, but Multiple Inheritance was not allowed there.

    @Override
    public void stop(){
        System.out.println("Inside Car1's stop()");
    }

    @Override
    public void acc(){
        System.out.println("Inside Car1's acc()");
    }

    @Override
    public void size(){
        System.out.println("Inside Car1's size()");
    }

    @Override
    public void brake(){
        System.out.println("Inside Car1's brake()");
    }
}
