package A_Theory.OOP.PrinciplesOfOOP.Inheritance;

public class Main {
    public static void main(String[] args) {     
        // Parent class
        Box b1 = new Box(4.6, 2.8, 9.9);
        Box b2 = new Box(b1);
        System.out.println(b1.length+" "+b1.width+" "+b1.height);
        System.out.println(b2.length+" "+b2.width+" "+b2.height);


        // Child class
        BoxWeight c1 = new BoxWeight();
        System.out.println(c1.length+" "+c1.width+" "+c1.height+" "+c1.weight);

        BoxWeight c2 = new BoxWeight(80, 180, 50, 180, false);
        System.out.println(c2.length+" "+c2.width+" "+c2.height+" "+c2.weight+" " /*c2.isEmpty */);  //  can't access the isEmpty of parent class because it is private.

        // some wired things

        // Parent ref, Child object 

        Box b3 = new BoxWeight(1, 2, 3, 80);
        Box b4 = new Box(c2);   // Parent ref can also be made form child class object as it will have all the members of child as well as parent classes (it will only use the members that are present in parent)

        System.out.println(b3.length);
        // System.out.println(b3.weight); // can't access weight

        // this is to note that it is actually the type of reference which determine what members can be access

        // Child ref, Parent object

        // BoxWeight c3 = new Box(50);
        BoxWeight c4 = new BoxWeight(c2);


        // Box Price object (for multi-level inheritance)

        BoxPrice bp1 = new BoxPrice();  // calling default constructor
        System.out.println("Default Box Price : ");
        System.out.println("length ="+bp1.length);
        System.out.println("width = "+bp1.width);
        System.out.println("height = "+bp1.height);
        System.out.println("weight = "+bp1.weight);
        System.out.println("price = "+bp1.price);

        BoxPrice bp2 = new BoxPrice(50, 100, 30, 1, 1000);  // calling parameterised constructor
        System.out.println("Parameterised Box Price : ");
        System.out.println("length = "+bp2.length);
        System.out.println("width = "+bp2.width);
        System.out.println("height = "+bp2.height);
        System.out.println("weight = "+bp2.weight);
        System.out.println("price = "+bp2.price);

    }
}
