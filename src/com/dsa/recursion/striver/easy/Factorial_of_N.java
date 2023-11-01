package com.dsa.recursion.striver.easy;

public class Factorial_of_N {
    public static void main(String[] args){
        int n = 4;
        int fact = 1;
        parameterized(n, fact);
        System.out.println("Factorial using functional approach is "+functional(n));
    }
    public static void parameterized(int n, int fact){
        if(n <= 1){
            System.out.println("Factorial using parametrized approach is "+fact);
            return;
        }
        parameterized(n - 1, fact * n);
    }
    public static int functional(int n){
        if(n <= 1) return 1;
        else return n * functional(n - 1);
    }
}
