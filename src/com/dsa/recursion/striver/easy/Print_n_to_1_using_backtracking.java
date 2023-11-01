package com.dsa.recursion.striver.easy;

public class Print_n_to_1_using_backtracking {
    public static void main(String[] a){
        int n = 10;
        print(1, n);
    }
    public static void print(int i, int n){
        if(i > n)   return;
        print(i + 1, n);
        if(i == 1)  System.out.print("and "+i);
        else System.out.print(i+", ");
    }
}
