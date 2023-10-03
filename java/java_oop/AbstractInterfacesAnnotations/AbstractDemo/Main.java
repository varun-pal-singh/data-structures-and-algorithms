package java.java_oop.AbstractInterfacesAnnotations.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son obj1 = new Son(23);
        obj1.carrer("Softwere Engineer");
        obj1.partner("herName", "herAge");

        Daughter obj2 = new Daughter(22);
        obj2.carrer("Docter");
        obj2.partner("hisName", "hisAge");

        AbstractDemo obj3 = new Son(23);
        AbstractDemo.greeting();
        obj3.normal();
    }
}
