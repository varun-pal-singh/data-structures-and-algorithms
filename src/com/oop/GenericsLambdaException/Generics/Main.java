package com.oop.GenericsLambdaException.Generics;

import java.util.ArrayList;

public abstract class Main {
     public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(45);
        list.add(50);
        System.out.println(list.isEmpty()+" "+list.size());
        System.out.println(list);

        // Custom ArrayList
        CustomIntegerArrayList list2 = new CustomIntegerArrayList();
        System.out.println(list2);

        // Custom Generic Type ArrayList

        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();

        for(int i = 0; i< 15; i++){
            list3.add(i);
        }
        // list3.add("String");  //error
        System.out.println(list3);
    }
}
