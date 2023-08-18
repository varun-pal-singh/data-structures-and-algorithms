package A_Theory.OOP.Packages_Static_Singleton_Inbuilt_Methods.staticExample;

// outer classes cannot be static because they are not dependent on any other classes.
// inner classes have to static because they are dependent on outer classes (this means that by adding static to inner class, main will not requrie an object of outer class)
public class InnerClasses {
    static class Inner1{
        String name;
        static String className;

        Inner1(String name, String className){
            this.name = name;
            Inner1.className = className;
        }
    }

    class Inner2{
        String name;

        Inner2(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        System.out.println();

        Inner1 obj1 = new Inner1("Test1", "Calling innerClass first time");
        System.out.println("Obj1 name = "+obj1.name);
        

        Inner1 obj2 = new Inner1("Test2", "Calling innerClass second time");

        System.out.println("ClassName for obj1 = "+Inner1.className);
        System.out.println("ClassName for obj1  = "+Inner1.className);

        // for second inner class

        // Inner2 obj3 = new Inner2();  // Error Inner2 is non-static inner class, to call non-static inner class we have to create object of outer class

        // InnerClasses outerObj = new InnerClasses();

        // outerObj.Inner2 obj4 = new outerObj.Inner2();

    }
}


// outer classes cannot be static because this is not dependent on any class
// static class Outer{

// }
