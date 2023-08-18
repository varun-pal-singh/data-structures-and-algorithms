package A_Theory.OOP.Packages_Static_Singleton_Inbuilt_Methods.staticExample;

// this is a demo to show initialisation of static variables

public class StaticBlock {
    static int a = 5;
    static int b;

    // static block is executed as soon as class is loaded (will only run once)
    static{
        System.out.println("I am in static block");
        b = a * 10;
        System.out.println("a = "+a+" and b = "+b);
    }

    public static void main(String[] args) {
        StaticBlock.b += 10;    // b = 60;
        StaticBlock obj1 = new StaticBlock();
        System.out.println("obj1 = "+obj1);

        System.out.println("b after creating an object is "+StaticBlock.b); // 60


        StaticBlock.b += 20;    // should be 80 ? lets see...
        
        StaticBlock obj2 = new StaticBlock();
        System.out.println("obj2 = "+obj2);

        System.out.println("b after creating another object is "+StaticBlock.b); // 80 ?
    }
}
