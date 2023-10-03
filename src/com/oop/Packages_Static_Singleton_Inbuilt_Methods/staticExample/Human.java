package com.oop.Packages_Static_Singleton_Inbuilt_Methods.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    long populationNonStatic;
    static long populationStatic;

    public Human(String name, int age, int salary, boolean isMarried){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;

        // static difference
        this.populationNonStatic += 1;

        // static propeties and methods are common to all instance of that class.
        // this.populationStatic += 1;  // static properties make no sense to make the connection with the instances.

        Human.populationStatic += 1;    // use class name for static properties and methods.
    }


}
