package com.dsa.recursion.problems;

public class Sum_of_first_n_natural_numbers {
    public static void main(String[] args){
        int n = 10;
        System.out.println("Sum for first "+n+" natural numbers is : "+sum(n));
    }
    private static int sum(int n){
        if(n <= 1)
            return 1;
        else
            return n + sum(n - 1);
    }
}
