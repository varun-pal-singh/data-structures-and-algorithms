package A_Theory.OOP.Packages_Static_Singleton_Inbuilt_Methods.staticExample;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        // whenever a propery is declared as static it can access through 
        // Class.property without making new instance by "new Class();"
        System.out.println("Present population : "+Human.populationStatic);
        System.out.println();

        Human obj1 = new Human("Varun", 23, 100000, false);
        Human obj2 = new Human("Sahil", 22, 100000, false);

        System.out.println("For object "+obj1.name);
        System.out.println("Non static population "+obj1.populationNonStatic);

        // static propeties and methods are common to all instance of that class.
        System.out.println("Static population "+Human.populationStatic);

        System.out.println();

        System.out.println("For object "+obj2.name);
        System.out.println("Non static population "+obj2.populationNonStatic);
        System.out.println("Static population "+Human.populationStatic);


        // Now check if population is increase by 1 when a new object is created ?

        Human obj3 = new Human("Sunil", 23, 100000, false);

        System.out.println();

        System.out.println("For object "+obj3.name);
        System.out.println("Non static population "+obj3.populationNonStatic);
        System.out.println("Static population "+Human.populationStatic);

        // hence
        System.out.println();

        System.out.println("For every human object nonStatic population is "+obj3.populationNonStatic+" and static population is "+Human.populationStatic);

        // func1()
        Main.func1();
        // or 
        func1(); // same class

        System.out.println();

        // calling non-static method from a non-static method
        Main mainObj2 = new Main();
        mainObj2.func3();   // to call func3 from main(), main() requires object of this class.
    }

    static void func1(){
        // func2(); // without specifing which instance non-static func2(), we cannot use it here.

        // Main.func2();    // Main class is static but func2() is non-static.

        // so, we have to try this 

        Main mainObj = new Main();
        mainObj.func2();
    }
    void func2(){
        System.out.println("Inside non-static function func2()");
        // func1(); // static properties can be access from non-static method
    }

    void func3(){
        func2();    // here it is possible because for calling func3 main will require object of this class, if object is provided then func3 will never be execute, so no error
    }
}
