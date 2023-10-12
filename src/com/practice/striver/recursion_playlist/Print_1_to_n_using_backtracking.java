package com.practice.striver.recursion_playlist;

public class Print_1_to_n_using_backtracking {
    public static void main(String[] a){
        int n = 10;
        print(n, n);
    }
    // i + 1 not allowed
    public static void print(int i, int n){
        if(i < 1)   return;
        print(i - 1, n);
        if(i == n)  System.out.println("and "+n);
        else System.out.print(i+", ");
    }
}
