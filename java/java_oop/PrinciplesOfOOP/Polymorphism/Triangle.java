package java.java_oop.PrinciplesOfOOP.Polymorphism;

public class Triangle extends Shapes{
    @Override
    void area(){
        System.out.println("Area is 0.5 * h * b");
    }

    // @Override    // area1 is not present in parent class so @Override will throw an error here.
    void area1(){   
        System.out.println("Area is 0.5 * h * b");
    }
}
