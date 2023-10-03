package com.oop.Classes_Constructors_Objects;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer c = 10;
        Integer d = 20;
        swap(a, b);
        System.out.println(a+" "+b);    // not swapped (primitive can be swapped)
        swap(c, d);
        System.out.println(c+" "+d);    // not swapped (Integer class is of type final)

        // final int NUM1; // have to initialize when declaring
        final int NUM2 = 5;
        System.out.println(NUM2);
        // NUM2 = 10;   cannot be modified
        // final guarantee this immutability to primitive that
        // their values can not be modified but in case, when 
        // final is places before ref to object then it will 
        // only point to that object, it cannot be modified to
        // refer to another object but properties inside 
        // objects can be changed.

        // Example 
        final FinalObjectExample person1 = new FinalObjectExample("varun");

        FinalObjectExample person2 = new FinalObjectExample("Person2");
        System.out.println("Person2 -> "+person2);

        // now, things that can be done
        System.out.println("Person1 name -> "+person1.name);
        person1.name = "New Name";  // changeing properity
        System.out.println("Person1 name -> "+person1.name);

        // things that can not be done
        // cannot change the reference to other object, when a 
        // non primitive is final, you cannot reassign it.
        
        // person1 = person2;  

        // Garbage collection Example

        FinalObjectExample obj = new FinalObjectExample("something");
        for (int i = 0; i < 1000000; i++) {
            obj = new FinalObjectExample("some value");
        }
        System.out.println(obj.name);

    }
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public static void swap(Integer num1, Integer num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}

class FinalObjectExample{
    final int num = 10;
    String name;

    // constructor
    FinalObjectExample(String name){
        this.name = name;
    }

    // destructor
     @Override
     protected void finalize() throws Throwable{
         System.out.println("Object is destroyed!!");
     }
}
