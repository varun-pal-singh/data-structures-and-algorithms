package com.oop.Packages_Static_Singleton_Inbuilt_Methods.singletonClasses;

// What is singleton class ?
// It is class of which you can create only one object.

// How to do this ?
// don't let anyone to use constructor of this class (by using private keyword).
public class SingletonExample{
    public static void main(String[] args) {
        // Singleton1 obj1 = new Singleton1(5, 10);
        // System.out.println(obj1.n1+" "+obj1.n2);


        Singleton1 obj2 = Singleton1.getInstance(5 ,10);
        System.out.println(obj2.n1+" and "+obj2.n2);    // 5 and 10

        Singleton1 obj3 = Singleton1.getInstance(20, 30);
        System.out.println(obj3.n1+" and "+obj3.n2);    // 5 and 10

        Singleton1 obj4 = Singleton1.getInstance(20, 30);
        System.out.println(obj4.n1+" and "+obj4.n2);    // 5 and 10

        System.out.println("All the objects have same hash value : "+obj2+", "+obj3+" and "+obj4+" because it is just one object.");

    }
}

class Singleton1{
    int n1;
    int n2;

    // whatever things are private, that will only available to this class.
    private Singleton1(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    private static Singleton1 instance;

    public static Singleton1 getInstance(int n1, int n2){
        // check wether only object is created or not
        if(instance == null){
            instance = new Singleton1(n1, n2);
        }
        return instance;
    }
}
