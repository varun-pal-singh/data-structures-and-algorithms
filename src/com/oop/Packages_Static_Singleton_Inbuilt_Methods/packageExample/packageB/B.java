package com.oop.Packages_Static_Singleton_Inbuilt_Methods.packageExample.packageB;

public class B {
    String message = "I am inside in B";
    String name;
    
    public B(String name){
        this.name = name;
        System.out.println(this.name+" "+message);
    }
}
