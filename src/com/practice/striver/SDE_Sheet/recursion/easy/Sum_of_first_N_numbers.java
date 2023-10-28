package com.practice.striver.SDE_Sheet.recursion.easy;

public class Sum_of_first_N_numbers {
    public static void main(String[] args){
        int n = 10;
        int sum = 0;
        sumParameterized(n, sum);
        System.out.println("Summation of first n numbers is "+sumFunctional(n));
    }
    public static void sumParameterized(int n, int sum){
        if(n <= 0){
            System.out.println("Sum using parameter is "+sum);
            return;
        }
        sum += n;
        sumParameterized(n - 1, sum);
    }
    public static int sumFunctional(int n){
        if(n <= 0)  return 0;
        return n + sumFunctional(n - 1);
    }
}
