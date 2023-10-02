package A_Theory.OOP.AbstractInterfacesAnnotations.AbstractDemo;

public abstract class AbstractDemo {
    int age;

    public AbstractDemo(int age){
        this.age = age;
    }

    public void normal(){
        System.out.println("I am inside parent's normal");
    }

    public static void greeting(){
        System.out.println("Hello World!");
    }
    abstract void carrer(String carrerName);
    abstract void partner(String name, String age);
}
